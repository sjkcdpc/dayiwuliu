package com.tianrui.service.admin.impl.pay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianrui.api.admin.intf.IPayInvoiceDetail1Service;
import com.tianrui.api.req.admin.pay.PayInviceSave1Req;
import com.tianrui.api.req.admin.pay.PayInvoiceDetail1FindReq;
import com.tianrui.api.req.admin.pay.PayInvoiceDetail1Req;
import com.tianrui.api.resp.admin.pay.PayInvoiceDetail1Resp;
import com.tianrui.common.constants.Constant;
import com.tianrui.common.utils.UUIDUtil;
import com.tianrui.common.vo.PaginationVO;
import com.tianrui.common.vo.Result;
import com.tianrui.service.admin.bean.PayInvoice;
import com.tianrui.service.admin.bean.PayInvoiceDetail;
import com.tianrui.service.admin.bean.PayPriceSave;
import com.tianrui.service.admin.mapper.PayInvoiceDetailMapper1;
import com.tianrui.service.admin.mapper.PayInvoiceMapper1;
import com.tianrui.service.bean.Bill;
import com.tianrui.service.bean.MemberBankCard;
import com.tianrui.service.bean.SystemMember;
import com.tianrui.service.bean.anlian.AnlianBill;
import com.tianrui.service.mapper.AnlianBillMapper;
import com.tianrui.service.mapper.BillMapper;
import com.tianrui.service.mapper.MemberBankCardMapper;
import com.tianrui.service.mapper.SystemMemberMapper;
import com.tianrui.service.mongo.CodeGenDao;

@Service
public class PayInvoiceDetail1Service implements IPayInvoiceDetail1Service{

	@Autowired
	PayInvoiceDetailMapper1 payInvoiceDetailMapper1;
	@Autowired
	PayInvoiceMapper1 payInvoiceMapper1;
	@Autowired
	CodeGenDao codeGenDao;
	@Autowired
	MemberBankCardMapper memberBankCardMapper;
	@Autowired
	SystemMemberMapper systemMemberMapper;
	@Autowired
	BillMapper billMapper;
	@Autowired
	AnlianBillMapper anlianBillMapper;
	
	@Override
	public Result billSelectPrice(PayInvoiceDetail1Req req) throws Exception {
		Result rs = Result.getSuccessResult();
		if(StringUtils.isBlank(req.getBillId())){
			rs.setCode("1");
			rs.setError("运单id不能为空");
			return rs;
		}
		PayInvoiceDetail pay = new PayInvoiceDetail();
		pay.setBillId(req.getBillId());
		List<PayInvoiceDetail> list = payInvoiceDetailMapper1.selectByCondition(pay);
		if(list.size()==0){
			rs.setCode("1");
			rs.setError("运单还未运价确认");
			return rs;
		}else if(list.size()==1){
			rs.setData(list.get(0));
			return rs;
		}else {
			rs.setCode("2");
			rs.setError("运单异常，请联系管理员");
			return rs;
		}
	}
	
	@Override
	public PaginationVO<PayInvoiceDetail1Resp> select(PayInvoiceDetail1FindReq req) throws Exception {
		PaginationVO<PayInvoiceDetail1Resp> page = new PaginationVO<PayInvoiceDetail1Resp>();
		
		PayInvoiceDetail pay = new PayInvoiceDetail();
		PropertyUtils.copyProperties(pay, req);
		pay.setSearchKey(req.getSearchKey());
		if(StringUtils.isNotBlank(req.getIdStr())){
			String[] idArr = req.getIdStr().split(";");
			pay.setIds(Arrays.asList(idArr));
		}
		
		if(req.getPageNo()!=null){
			pay.setPageNo(req.getPageNo()*req.getPageSize());
			pay.setPageSize(req.getPageSize());
			page.setPageNo(req.getPageNo());
			page.setPageSize(req.getPageSize());
		}
		List<PayInvoiceDetail> list = payInvoiceDetailMapper1.selectByCondition(pay);
		long a =payInvoiceDetailMapper1.selectBycount(pay);
		page.setTotal(a);
		page.setList(copyProperties2(list));
		return page;
	}
	protected List<PayInvoiceDetail1Resp> copyProperties2(List<PayInvoiceDetail> list) throws Exception {
		List<PayInvoiceDetail1Resp> resp = new ArrayList<PayInvoiceDetail1Resp>();
		for(PayInvoiceDetail pay : list){
			PayInvoiceDetail1Resp sp = new PayInvoiceDetail1Resp();
			PropertyUtils.copyProperties(sp, pay);
			
			resp.add(sp);
		}
		return resp;
	}
	@Override
	public PayInvoiceDetail1Resp selectById(String id) throws Exception {
		PayInvoiceDetail pay = payInvoiceDetailMapper1.selectByPrimaryKey(id);
		PayInvoiceDetail1Resp resp = new PayInvoiceDetail1Resp();
		PropertyUtils.copyProperties(resp, pay);
		return resp;
	}
	/** 后台运价确认*/
	@Override
	public Result uptPrice(PayInvoiceDetail1Req req) throws Exception{
		Result rs = Result.getSuccessResult();
		PayInvoiceDetail pay = payInvoiceDetailMapper1.selectByPrimaryKey(req.getId());
		//修改运单状态为后台已审核状态
		if(StringUtils.equals("dy", pay.getRemark())){
			//大易运单
			Bill bill = billMapper.selectByPrimaryKey(pay.getBillId());
			if(bill != null){
				Bill upt = new Bill();
				upt.setId(bill.getId());
				upt.setConfirmPriceB("1");//后台已运价确认
				billMapper.updateByPrimaryKeySelective(upt);
			}else {
				rs.setCode("1");
				rs.setError("数据异常，请联系管理员");
				return rs;
			}
		}else if(StringUtils.equals("al", pay.getRemark())){
			//安联运单
			AnlianBill bill =anlianBillMapper.selectByPrimaryKey(pay.getBillId());
			if(bill != null){
				AnlianBill upt = new AnlianBill();
				upt.setId(bill.getId());
				upt.setConfirmPriceB("1");
				anlianBillMapper.updateByPrimaryKeySelective(upt);
			}else{
				rs.setCode("1");
				rs.setError("数据异常，请联系管理员");
				return rs;
			}
		}
		
		PayInvoiceDetail upt = new PayInvoiceDetail();
		PropertyUtils.copyProperties(upt, req);
		upt.setBackstageBillTotalPrice(pay.getReceptionBillTotalPrice());
		payInvoiceDetailMapper1.updateByPrimaryKeySelective(upt);
		
		//支付对象为司机
		if(pay.getBillType()==1){
			PayInviceSave1Req driverPay = new PayInviceSave1Req();
			driverPay.setIdStr(pay.getId());
			driverPay.setAdPayeeidType("1");
			driverPay.setCreater("admin");
			//生成账单
			rs = savePayInvoice(driverPay);
		}
		return rs;
	}
	@Override
	public Result savePayInvoice(PayInviceSave1Req req) throws Exception {
		Result rs = Result.getSuccessResult();
		
		if((StringUtils.isNotBlank(req.getCreater())&&StringUtils.isNotBlank(req.getIdStr()))||StringUtils.isNotBlank(req.getAdPayeeidType())){
			String[] idArr = req.getIdStr().split(";");
			PayInvoiceDetail pay = new PayInvoiceDetail();
			pay.setIds(Arrays.asList(idArr));
			List<PayInvoiceDetail> list = payInvoiceDetailMapper1.selectByCondition(pay);
			//传入数据无误
			if(idArr.length==list.size()){
				//验证操作权限
				if(checkVender(req.getCreater(),list)){
					//验证账单状态
					if(checkInvoiceStatus(list)){
						//验证发票类型
						if(checkInvoiceType(list)){
							//前台--
							//总价
							Double totalPrice = 0.00;
							//扣重扣杂
							Double weightMisc = 0.00;
							//扣款
							Double deductMoney = 0.00;
							//扣款
							Double deductOther = 0.00;
							//油卡扣款
							Double oilCard = 0.00;
							
							//后台--
							//总价
							Double totalPriceB = 0.00;
							//扣重扣杂
							Double weightMiscB = 0.00;
							//扣款
							Double deductMoneyB = 0.00;
							//扣款
							Double deductOtherB = 0.00;
							//油卡扣款
							Double oilCardB = 0.00;
							for(PayInvoiceDetail d : list){
								if(d.getBackstageBillTotalPrice()==0){
									rs.setCode("1");
									rs.setError("管理员尚未确认的账单"+d.getBillCode());
									return rs;
								}else {
									//后台
									totalPriceB += d.getBackstageBillTotalPrice();
									weightMiscB += d.getBackstageDeductWeightMisc();
									deductMoneyB += d.getBackstageDeductMoney();
									deductOtherB += d.getBackstageDeductOther();
									oilCardB += d.getBackstageDeductOilCard();
									//前台
									totalPrice += d.getReceptionBillTotalPrice();
									weightMisc += d.getReceptionDeductWeightMisc();
									deductMoney += d.getReceptionDeductMoney();
									deductOther += d.getReceptionDeductOther();
									oilCard += d.getReceptionDeductOilCard();
								}
							}
							PayInvoice invoice = new PayInvoice();
							String invoiceid = UUIDUtil.getId();
							//账单id
							invoice.setId(invoiceid);
							//后台扣款信息
							invoice.setBackstageBillTotalPrice(totalPriceB);
							invoice.setBackstageDeductMoney(deductMoneyB);
							invoice.setBackstageDeductOilCard(oilCardB);
							invoice.setBackstageDeductOther(deductOtherB);
							invoice.setBackstageDeductWeightMisc(weightMiscB);
							//前台扣款信息
							invoice.setReceptionBillTotalPrice(totalPrice);
							invoice.setReceptionDeductMoney(deductMoney);
							invoice.setReceptionDeductOilCard(oilCard);
							invoice.setReceptionDeductOther(deductOther);
							invoice.setReceptionDeductWeightMisc(weightMisc);
							//应付金额=总额-后台运价确认扣款信息
							invoice.setAmountPayable(totalPriceB-deductMoneyB-oilCardB-deductOtherB-weightMiscB);
							//编号
							invoice.setCode(codeGenDao.codeGen(4));
							//账单类型
							invoice.setInvoiceCode(list.get(0).getInvoiceCode());
							//账单类型名称
							invoice.setInvoiceName(list.get(0).getInvoiceName());
							//已付金额
							invoice.setPaidAmount((double) 0);
							
							//物料编码
							invoice.setMaterialCode(list.get(0).getInvoiceCode());
							invoice.setMaterialName(list.get(0).getInvoiceName());
							//收款人身份
							invoice.setPayeeIdentity(list.get(0).getBillType());
							
							//支付状态（0：未支付，1：支付中，2：已支付）
							invoice.setPayStatus(Constant.NOT_PAY);
							//是否有效（0：无效，1：有效）
							invoice.setState(Constant.DATA_VALID);
							
							String payeeid = "";
							if(StringUtils.equals("1", req.getAdPayeeidType())){
								//判断是否为后台司机运价确认
								if(list.get(0).getBillType()==Constant.PAY_INVOICE_DRIVER){
									//支付到司机
									//收款人id
									payeeid = list.get(0).getDriverId();
									//审核状态（0：未审核，1：审核中，2：已审核）
									invoice.setAuditStatus(Constant.YES_AUDIT);
									//推单状态（0：未推单，1：退单中，2已退单）
									invoice.setPushStatus(Constant.PUSH_ING);
								}else if(list.get(0).getBillType()==Constant.PAY_INVOICE_VENDER){
									rs.setCode("1");
									rs.setError("车主账单，不支持改操作");
									return rs;
								}
								
							}else if(list.get(0).getBillType()==Constant.PAY_INVOICE_VENDER){
								//支付到车主
								//收款人id
								payeeid = list.get(0).getVenderId();
								//审核状态（0：未审核，1：审核中，2：已审核）
								invoice.setAuditStatus(Constant.NOT_AUDIT);
								//推单状态（0：未推单，1：退单中，2已退单）
								invoice.setPushStatus(Constant.NOT_PUSH);
							}else{
								rs.setCode("1");
								rs.setError("未找到支付对象");
								return rs;
							}
							//查询收款人银行卡
							MemberBankCard bank = new MemberBankCard();
							bank.setBankautid("1");//认证状态 1-认证成功
							bank.setBankstatus("1");//1-默认银行卡
							bank.setCreater(payeeid);
							List<MemberBankCard> banklist = memberBankCardMapper.selectByCondition(bank);
							if(banklist.size()!=1){
								rs.setCode("1");
								rs.setError("支付对象未找到银行卡");
								return rs;
							}
							SystemMember member = systemMemberMapper.selectByPrimaryKey(payeeid);
							MemberBankCard bcard = banklist.get(0);
							invoice.setPayeeId(payeeid);
							//收款人名称
							invoice.setPayeeName(bcard.getIdname());
							//收款人账号
							invoice.setPayeeAccount(member.getCellphone());
							//收款人银行卡id
							invoice.setPayeeBankCardId(bcard.getId());
							//收款人银行卡号
							invoice.setPayeeBankCardNumber(bcard.getBankcard());
							//收款人证件号
							invoice.setPayeeIdNo(bcard.getIdcard());
							//申请日期
							invoice.setApplicationTime(System.currentTimeMillis());
							//创建日期
							invoice.setCreateTime(System.currentTimeMillis());
							//创建人
							invoice.setCreator(req.getCreater());
							
							payInvoiceMapper1.insertSelective(invoice);
							
							for(PayInvoiceDetail dat :list){
								//修改账单为已开票
								PayInvoiceDetail upt = new PayInvoiceDetail();
								upt.setId(dat.getId());
								upt.setWhetherClose(true);
								upt.setPayInvoiceId(invoiceid);
								payInvoiceDetailMapper1.updateByPrimaryKeySelective(upt);
							}
						}else{
							rs.setCode("1");
							rs.setError("发票类型不一致");
						}
					}else{
						rs.setCode("1");
						rs.setError("存在已开票账单");
					}
				}else{
					rs.setCode("1");
					rs.setError("该用户无操作权限");
				}
			}else{
				rs.setCode("1");
				rs.setError("传入数据有误");
			}
		}
		
		return rs;
	}
	
	/**验证是否未合单*/
	protected boolean checkInvoiceStatus(List<PayInvoiceDetail> list) {
		//TODO
		for(PayInvoiceDetail pay : list){
			//运单已合单
			if(pay.getWhetherClose()){
				return false;
			}
		}
		return true;
	}
	
	/**验证是否有操作权限*/
	protected boolean checkVender(String creater,List<PayInvoiceDetail> list) {
		for(PayInvoiceDetail pay : list){
			if(pay.getBillType()==2){
				//车主    车主账单前台账户操作 
				if(!StringUtils.equals(creater, pay.getVenderId())){
					return false;
				}
			}
		}
		return true;
	}
	
	/**验证账单类型*/
	protected boolean checkInvoiceType(List<PayInvoiceDetail> list) {
		for (int i = 0; i < list.size(); i++) {
			PayInvoiceDetail pay = list.get(0);
			if(!StringUtils.equals(pay.getInvoiceCode(), list.get(0).getInvoiceCode())){
				return false;
			}
		}
		return true;
	}
	
}