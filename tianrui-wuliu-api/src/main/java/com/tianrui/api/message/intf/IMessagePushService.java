package com.tianrui.api.message.intf;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.tianrui.api.req.money.MessagePushReq;
import com.tianrui.api.resp.money.MessagePushResp;
import com.tianrui.common.vo.Result;

public interface IMessagePushService {

	/**
	 * 保存待推送消息
	 * @param req
	 * @return
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	Result save(MessagePushReq req) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;
	/**
	 * 消息浏览次数+1
	 * @param id
	 * @return
	 */
	Result updateConsultNumber(Long id);
	/**
	 * APP拨打电话次数+1
	 * @return
	 */
	Result updateCalledNumber();
	
	List<MessagePushResp> findPendingMessage();
	void updatePushState(Long id, int sendCount, Long beginTime);
}
