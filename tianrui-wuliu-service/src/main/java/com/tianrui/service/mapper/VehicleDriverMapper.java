package com.tianrui.service.mapper;

import java.util.List;

import com.tianrui.service.bean.VehicleDriver;
import com.tianrui.service.bean.VehicleDriverMember;

public interface VehicleDriverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wuliu_vehicle_driver
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wuliu_vehicle_driver
     *
     * @mbggenerated
     */
    int insert(VehicleDriver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wuliu_vehicle_driver
     *
     * @mbggenerated
     */
    int insertSelective(VehicleDriver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wuliu_vehicle_driver
     *
     * @mbggenerated
     */
    VehicleDriver selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wuliu_vehicle_driver
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(VehicleDriver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wuliu_vehicle_driver
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VehicleDriver record);
    
    List<VehicleDriverMember> findList(VehicleDriverMember record);
    
    long findListCount(VehicleDriverMember record);
    
    List<VehicleDriver> findWithEntity(VehicleDriver record);
    
    /**
     * 根据条件进行车辆司机关系信息查询
     * <p>
     * @param argCondition
     * @return
     * <p>
     * @author guyuke
     * @time 2016年6月06日 上午11:14:00
     */
    List<VehicleDriver> selectMyVehiDriverByCondition(VehicleDriver argCondition);
    
    /**
     * 根据条件进行车辆司机关系信息数据总量查询
     * <p>
     * @param argCondition
     * @return
     * <p>
     * @author guyuke
     * @time 2016年6月06日 上午11:14:00
     */
    long selectCountByCondition(VehicleDriver argCondition);
}