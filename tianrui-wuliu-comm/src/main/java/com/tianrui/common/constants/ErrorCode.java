package com.tianrui.common.constants;

public enum ErrorCode {

	//系统异常
	SYSTEM_ERROR("E000001","服务器繁忙."),
	
	//参数异常
	PARAM_ERROR("E100001","参数异常."),
	PARAM_NULL_ERROR("E100002","参数异常,参数不能为空."),
	PARAM_TOKEN_ERROR("E100003","参数异常."),
	PARAM_PARAM_ERROR("E100004","校验码异常."),
	
	
	//用户异常
	MEMBER_LOGIN_NOREG_ERROR("E200001","用户尚未注册."),
	MEMBER_LOGIN_PSWD_ERROR("E200002","用户密码错误."),
	MEMBER_USER_ERROR("E200003","用户尚未登录."),
	
	//路径档案
	FILEROUTE_USER_IS_NULL("E201001","登录用户或者用户组织为空."),
	FILEROUTE_REFUSE_NOT_ORG("E201002","不能操作不是同一组织的数据."),
	
	//运单信息
	BILL_NOT_FIND("E301001","不能操作不是同一组织的数据."),
	BILL_PERMISSIONS("E301002","该用户没有权限操作此运单."),
	BILL_STATUS_ERROR("E301003","操作失败,请刷新"),
	BILL_STATUS_VEHICLE_ONLYONE("E301004","同一个运力只能有一个在途运单"),
	BILL_STATUS_IMG_UPLOAD("E301005","榜单图片上传失败"),
	BILL_VEHICLE_BILLSTATUS("E301006","非空闲车辆不能接单"),
	
	//运价策略审核
	FILE_FREIGHT_NULL("E401000","请选择是否通过审核"),
	FILE_FREIGHT_AUDIT_NULL("E401001","请输入审核不通过原因"),
	FILE_FREIGHT_ERROR("E401002","操作失败，请稍后再试"),
	FILE_FREIGHT_INFO("E401003","未查到审核信息"),
	FILE_FREIGHT_AUDIT0("E401004","非审核中不能审核"),
	FILE_FREIGHT_UPDATE("E401005","审核中策略不能修改"),
	BILL_DRIVER_DEL("E301007","改运单司机已删除"),
	BILL_VENDER_DEL("E301008","改运单车主已删除"),
	BILL_OWNER_DEL("E301009","改运单货主已删除"),
	
	//运力共享
	VEHICLE_CAPA_EXIST("E501000","运力已添加"),
	VEHICLE_CAPA_VEHICLE("E501001","车辆不存在")
	;
	
	private String code;
	private String msg;
	
	private ErrorCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
