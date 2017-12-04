package com.tianrui.service.impl.message;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianrui.api.message.intf.IMessageRollingService;
import com.tianrui.api.req.money.AppMessageReq;
import com.tianrui.api.req.money.MessageRollingReq;
import com.tianrui.api.resp.front.message.AppPlatformMessageResp;
import com.tianrui.api.resp.money.MessageRollingResp;
import com.tianrui.common.vo.Result;
import com.tianrui.service.bean.MessageRolling;
import com.tianrui.service.mapper.MessageRollingMapper;
@Service
public class MessageRollingService implements IMessageRollingService {

	Logger logger=LoggerFactory.getLogger(MessageRollingService.class);
	@Autowired 
	private MessageRollingMapper messageRollingMapper;
	@Override
	public Result save(MessageRollingReq req) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Result rs = Result.getSuccessResult();
		MessageRolling mr = new MessageRolling();
		PropertyUtils.copyProperties(mr,req);
		messageRollingMapper.insertSelective(mr);
		return rs;
	}
	@Override
	public Result updateConsultNumber(long id) {
		Result rs = Result.getSuccessResult();
		MessageRolling record = messageRollingMapper.selectByPrimaryKey(id);
		if(null != record){
			record.setConsultNumber(record.getConsultNumber() +1 );
			messageRollingMapper.updateByPrimaryKeySelective(record);
		}
		return rs;
	}
	@Override
	public List<MessageRollingResp> findRollingMessage(int number) {
		AppMessageReq req = new AppMessageReq();
		req.setPageNo(0);;
		req.setPageSize(number);
		List<MessageRolling> list = messageRollingMapper.selectByCondition(req);
		List<MessageRollingResp> respList =  new ArrayList<MessageRollingResp>();
		for(MessageRolling mr : list){
			MessageRollingResp resp =  new MessageRollingResp();
			resp.setDeparture(mr.getDesc1());
			resp.setId(mr.getId());
			resp.setMessageContent(mr.getMessageContent());
			resp.setTime(mr.getDesc3());
			resp.setUnloading(mr.getDesc2());
			respList.add(resp);
		}
		return respList;
	}
	@Override
	public Result getAppPlatformMessage() {
		Result rs = Result.getSuccessResult();
		List<AppPlatformMessageResp> ls = new ArrayList<AppPlatformMessageResp>();
		getData(ls);
		rs.setData(ls);
		return rs;
	}
	private void getData(List<AppPlatformMessageResp> ls) {
		AppPlatformMessageResp m1 = new AppPlatformMessageResp();
		m1.setDataName("成交总量");
		m1.setDataValue("61291.14万吨");
		m1.setTrend("+%1.31");
		ls.add(m1);
		AppPlatformMessageResp m2 = new AppPlatformMessageResp();
		m2.setDataName("待承运");
		m2.setDataValue("368.00万吨");
		m2.setTrend("-%1.08");
		ls.add(m2);
		AppPlatformMessageResp m3 = new AppPlatformMessageResp();
		m3.setDataName("今日新发");
		m3.setDataValue("800吨");
		m3.setTrend("+%1.00");
		ls.add(m3);
	}

}
