package com.tianrui.quartz.count.hour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tianrui.api.intf.ICountService;
import com.tianrui.api.req.count.CountSelectReq;

/**
 * 
 * @类描述：每天执行的定时任务
 * @创建人：lsj
 * @创建时间：2016年10月29日下午2:47:17
 *
 * @修改人：lsj
 * @修改时间：2016年10月29日下午2:47:17
 * @修改备注：
 *
 */
@Component  
public class HourSchedule {
	
	@Autowired
	ICountService countService;
	
	@Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次  
    public void everyDay() throws Exception{  
	   System.out.println("每小时更新"); 
	   CountSelectReq req = new CountSelectReq();
	   countService.everyHour(req);
	   countService.billEveryDay(req);
    }  
}