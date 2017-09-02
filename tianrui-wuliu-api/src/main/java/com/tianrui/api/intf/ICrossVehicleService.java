package com.tianrui.api.intf;

import com.tianrui.api.req.admin.ZJXLVehicleReq;
import com.tianrui.api.resp.admin.PageResp;
import com.tianrui.api.resp.admin.ZJXLVehicleResp;
import com.tianrui.common.vo.Result;

public interface ICrossVehicleService {
	/**
	 * 中交车辆管理列表查询
	 * @Title: findCrossVehicleList 
	 * @Description: TODO
	 * @param @param req
	 * @param @return
	 * @param @throws Exception   
	 * @return List<DataDictResp>    
	 * @throws
	 */
	PageResp<ZJXLVehicleResp> find(ZJXLVehicleReq req)throws Exception;
	
	/**
	 * @Title: insert 
	 * @Description: TODO 添加车辆
	 * @param @param req
	 * @param @return
	 * @param @throws Exception   
	 * @return Result    
	 * @throws
	 */
	Result insert(ZJXLVehicleReq req)throws Exception;
	/**
	 * @Title: update 
	 * @Description: 启用/禁用
	 * @param @param id
	 * @param @return
	 * @param @throws Exception   
	 * @return Result    
	 * @throws
	 */
	Result update(String id)throws Exception;
	/**
	 * 
	 * @Title: selectVehicle 
	 * @Description: 车辆查找
	 * @param @param vehicleno
	 * @param @return
	 * @param @throws Exception   
	 * @return Result    
	 * @throws
	 */
	Result selectVehicle(String vehicleno)throws Exception;
	/**
	 * 
	 * @Title: deletes 
	 * @Description: 删除车辆信息
	 * @param @param id
	 * @param @return
	 * @param @throws Exception   
	 * @return Result    
	 * @throws
	 */
	Result deletes(String id)throws Exception;
	/**校验所有车辆中交兴路状态
	 * 
	 * @return
	 */
	public Result allVehicleconf();
}
