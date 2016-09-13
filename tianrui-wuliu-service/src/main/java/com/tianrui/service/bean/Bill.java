package com.tianrui.service.bean;

public class Bill {

	private String id;
    private String planid;
    private String plancode;
    private String vehicleid;
    private String driverid;
    private String routeid;
    private String drivername;
    private String drivertel;
    private String vehicleno;
    private String vehicletypename;
    private String cargoname;
    private String startcity;
    private String consignorname;
    private String consignortel;
    private String endtime;
    private String starttime;
    private String endcity;
    private String receivername;
    private String receivertel;
    private String priceunits;
    private Double distance;
    private Double price;
    //0 普通运单  1熟车运单 2批量运单
    private Byte type;
    private Byte status;
    private String waybillno;
    private Double weight;
    private Double trueweight;
    private String ownerid;
    private String venderid;
    private Byte venderdelflag;
    private Byte ownerdelflag;
    private Byte driverdelflag;
    private String creator;
    private Long createtime;
    private String modifier;
    private Long modifytime;
    private String signimgurl;
    //计量单位
    private String desc1;
    //拒绝原因
    private String desc2;
    //拒绝类型
    private String desc3;
    //是否由委派计划生成的运单
    private String desc4;
    
    private Integer start;
    private Integer limit;
    
    private Long createTimeBegin;
    private Long createTimeEnd;
    
    private String queryKey;
    private String orgid;
    
    private Byte[] statusStrs;
    //总趟数
    private String totalnumber;
    //剩余趟数
    private String overnumber;
    //取货单图片
    private String pickupimgurl;
    
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.ID
     *
     * @param id the value for wuliu_bill.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.planid
     *
     * @return the value of wuliu_bill.planid
     *
     * @mbggenerated
     */
    public String getPlanid() {
        return planid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.planid
     *
     * @param planid the value for wuliu_bill.planid
     *
     * @mbggenerated
     */
    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.vehicleid
     *
     * @return the value of wuliu_bill.vehicleid
     *
     * @mbggenerated
     */
    public String getVehicleid() {
        return vehicleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.vehicleid
     *
     * @param vehicleid the value for wuliu_bill.vehicleid
     *
     * @mbggenerated
     */
    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid == null ? null : vehicleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.driverid
     *
     * @return the value of wuliu_bill.driverid
     *
     * @mbggenerated
     */
    public String getDriverid() {
        return driverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.driverid
     *
     * @param driverid the value for wuliu_bill.driverid
     *
     * @mbggenerated
     */
    public void setDriverid(String driverid) {
        this.driverid = driverid == null ? null : driverid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.routeid
     *
     * @return the value of wuliu_bill.routeid
     *
     * @mbggenerated
     */
    public String getRouteid() {
        return routeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.routeid
     *
     * @param routeid the value for wuliu_bill.routeid
     *
     * @mbggenerated
     */
    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.drivername
     *
     * @return the value of wuliu_bill.drivername
     *
     * @mbggenerated
     */
    public String getDrivername() {
        return drivername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.drivername
     *
     * @param drivername the value for wuliu_bill.drivername
     *
     * @mbggenerated
     */
    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.drivertel
     *
     * @return the value of wuliu_bill.drivertel
     *
     * @mbggenerated
     */
    public String getDrivertel() {
        return drivertel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.drivertel
     *
     * @param drivertel the value for wuliu_bill.drivertel
     *
     * @mbggenerated
     */
    public void setDrivertel(String drivertel) {
        this.drivertel = drivertel == null ? null : drivertel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.vehicleno
     *
     * @return the value of wuliu_bill.vehicleno
     *
     * @mbggenerated
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.vehicleno
     *
     * @param vehicleno the value for wuliu_bill.vehicleno
     *
     * @mbggenerated
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno == null ? null : vehicleno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.vehicletypeName
     *
     * @return the value of wuliu_bill.vehicletypeName
     *
     * @mbggenerated
     */
    public String getVehicletypename() {
        return vehicletypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.vehicletypeName
     *
     * @param vehicletypename the value for wuliu_bill.vehicletypeName
     *
     * @mbggenerated
     */
    public void setVehicletypename(String vehicletypename) {
        this.vehicletypename = vehicletypename == null ? null : vehicletypename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.cargoname
     *
     * @return the value of wuliu_bill.cargoname
     *
     * @mbggenerated
     */
    public String getCargoname() {
        return cargoname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.cargoname
     *
     * @param cargoname the value for wuliu_bill.cargoname
     *
     * @mbggenerated
     */
    public void setCargoname(String cargoname) {
        this.cargoname = cargoname == null ? null : cargoname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.startcity
     *
     * @return the value of wuliu_bill.startcity
     *
     * @mbggenerated
     */
    public String getStartcity() {
        return startcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.startcity
     *
     * @param startcity the value for wuliu_bill.startcity
     *
     * @mbggenerated
     */
    public void setStartcity(String startcity) {
        this.startcity = startcity == null ? null : startcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.consignorname
     *
     * @return the value of wuliu_bill.consignorname
     *
     * @mbggenerated
     */
    public String getConsignorname() {
        return consignorname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.consignorname
     *
     * @param consignorname the value for wuliu_bill.consignorname
     *
     * @mbggenerated
     */
    public void setConsignorname(String consignorname) {
        this.consignorname = consignorname == null ? null : consignorname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.consignortel
     *
     * @return the value of wuliu_bill.consignortel
     *
     * @mbggenerated
     */
    public String getConsignortel() {
        return consignortel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.consignortel
     *
     * @param consignortel the value for wuliu_bill.consignortel
     *
     * @mbggenerated
     */
    public void setConsignortel(String consignortel) {
        this.consignortel = consignortel == null ? null : consignortel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.endTime
     *
     * @return the value of wuliu_bill.endTime
     *
     * @mbggenerated
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.endTime
     *
     * @param endtime the value for wuliu_bill.endTime
     *
     * @mbggenerated
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.startTime
     *
     * @return the value of wuliu_bill.startTime
     *
     * @mbggenerated
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.startTime
     *
     * @param starttime the value for wuliu_bill.startTime
     *
     * @mbggenerated
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.endcity
     *
     * @return the value of wuliu_bill.endcity
     *
     * @mbggenerated
     */
    public String getEndcity() {
        return endcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.endcity
     *
     * @param endcity the value for wuliu_bill.endcity
     *
     * @mbggenerated
     */
    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.receivername
     *
     * @return the value of wuliu_bill.receivername
     *
     * @mbggenerated
     */
    public String getReceivername() {
        return receivername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.receivername
     *
     * @param receivername the value for wuliu_bill.receivername
     *
     * @mbggenerated
     */
    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.receivertel
     *
     * @return the value of wuliu_bill.receivertel
     *
     * @mbggenerated
     */
    public String getReceivertel() {
        return receivertel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.receivertel
     *
     * @param receivertel the value for wuliu_bill.receivertel
     *
     * @mbggenerated
     */
    public void setReceivertel(String receivertel) {
        this.receivertel = receivertel == null ? null : receivertel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.priceUnits
     *
     * @return the value of wuliu_bill.priceUnits
     *
     * @mbggenerated
     */
    public String getPriceunits() {
        return priceunits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.priceUnits
     *
     * @param priceunits the value for wuliu_bill.priceUnits
     *
     * @mbggenerated
     */
    public void setPriceunits(String priceunits) {
        this.priceunits = priceunits == null ? null : priceunits.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.distance
     *
     * @return the value of wuliu_bill.distance
     *
     * @mbggenerated
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.distance
     *
     * @param distance the value for wuliu_bill.distance
     *
     * @mbggenerated
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.price
     *
     * @return the value of wuliu_bill.price
     *
     * @mbggenerated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.price
     *
     * @param price the value for wuliu_bill.price
     *
     * @mbggenerated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.type
     *
     * @return the value of wuliu_bill.type
     *
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.type
     *
     * @param type the value for wuliu_bill.type
     *
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.status
     *
     * @return the value of wuliu_bill.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.status
     *
     * @param status the value for wuliu_bill.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.waybillno
     *
     * @return the value of wuliu_bill.waybillno
     *
     * @mbggenerated
     */
    public String getWaybillno() {
        return waybillno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.waybillno
     *
     * @param waybillno the value for wuliu_bill.waybillno
     *
     * @mbggenerated
     */
    public void setWaybillno(String waybillno) {
        this.waybillno = waybillno == null ? null : waybillno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.weight
     *
     * @return the value of wuliu_bill.weight
     *
     * @mbggenerated
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.weight
     *
     * @param weight the value for wuliu_bill.weight
     *
     * @mbggenerated
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.trueweight
     *
     * @return the value of wuliu_bill.trueweight
     *
     * @mbggenerated
     */
    public Double getTrueweight() {
        return trueweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.trueweight
     *
     * @param trueweight the value for wuliu_bill.trueweight
     *
     * @mbggenerated
     */
    public void setTrueweight(Double trueweight) {
        this.trueweight = trueweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.ownerid
     *
     * @return the value of wuliu_bill.ownerid
     *
     * @mbggenerated
     */
    public String getOwnerid() {
        return ownerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.ownerid
     *
     * @param ownerid the value for wuliu_bill.ownerid
     *
     * @mbggenerated
     */
    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid == null ? null : ownerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.venderid
     *
     * @return the value of wuliu_bill.venderid
     *
     * @mbggenerated
     */
    public String getVenderid() {
        return venderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.venderid
     *
     * @param venderid the value for wuliu_bill.venderid
     *
     * @mbggenerated
     */
    public void setVenderid(String venderid) {
        this.venderid = venderid == null ? null : venderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.venderdelflag
     *
     * @return the value of wuliu_bill.venderdelflag
     *
     * @mbggenerated
     */
    public Byte getVenderdelflag() {
        return venderdelflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.venderdelflag
     *
     * @param venderdelflag the value for wuliu_bill.venderdelflag
     *
     * @mbggenerated
     */
    public void setVenderdelflag(Byte venderdelflag) {
        this.venderdelflag = venderdelflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.ownerdelflag
     *
     * @return the value of wuliu_bill.ownerdelflag
     *
     * @mbggenerated
     */
    public Byte getOwnerdelflag() {
        return ownerdelflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.ownerdelflag
     *
     * @param ownerdelflag the value for wuliu_bill.ownerdelflag
     *
     * @mbggenerated
     */
    public void setOwnerdelflag(Byte ownerdelflag) {
        this.ownerdelflag = ownerdelflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.driverdelflag
     *
     * @return the value of wuliu_bill.driverdelflag
     *
     * @mbggenerated
     */
    public Byte getDriverdelflag() {
        return driverdelflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.driverdelflag
     *
     * @param driverdelflag the value for wuliu_bill.driverdelflag
     *
     * @mbggenerated
     */
    public void setDriverdelflag(Byte driverdelflag) {
        this.driverdelflag = driverdelflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.creator
     *
     * @return the value of wuliu_bill.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.creator
     *
     * @param creator the value for wuliu_bill.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.createtime
     *
     * @return the value of wuliu_bill.createtime
     *
     * @mbggenerated
     */
    public Long getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.createtime
     *
     * @param createtime the value for wuliu_bill.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.modifier
     *
     * @return the value of wuliu_bill.modifier
     *
     * @mbggenerated
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.modifier
     *
     * @param modifier the value for wuliu_bill.modifier
     *
     * @mbggenerated
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.modifytime
     *
     * @return the value of wuliu_bill.modifytime
     *
     * @mbggenerated
     */
    public Long getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.modifytime
     *
     * @param modifytime the value for wuliu_bill.modifytime
     *
     * @mbggenerated
     */
    public void setModifytime(Long modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.DESC1
     *
     * @return the value of wuliu_bill.DESC1
     *
     * @mbggenerated
     */
    public String getDesc1() {
        return desc1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.DESC1
     *
     * @param desc1 the value for wuliu_bill.DESC1
     *
     * @mbggenerated
     */
    public void setDesc1(String desc1) {
        this.desc1 = desc1 == null ? null : desc1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.DESC2
     *
     * @return the value of wuliu_bill.DESC2
     *
     * @mbggenerated
     */
    public String getDesc2() {
        return desc2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.DESC2
     *
     * @param desc2 the value for wuliu_bill.DESC2
     *
     * @mbggenerated
     */
    public void setDesc2(String desc2) {
        this.desc2 = desc2 == null ? null : desc2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.DESC3
     *
     * @return the value of wuliu_bill.DESC3
     *
     * @mbggenerated
     */
    public String getDesc3() {
        return desc3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.DESC3
     *
     * @param desc3 the value for wuliu_bill.DESC3
     *
     * @mbggenerated
     */
    public void setDesc3(String desc3) {
        this.desc3 = desc3 == null ? null : desc3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wuliu_bill.DESC4
     *
     * @return the value of wuliu_bill.DESC4
     *
     * @mbggenerated
     */
    public String getDesc4() {
        return desc4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wuliu_bill.DESC4
     *
     * @param desc4 the value for wuliu_bill.DESC4
     *
     * @mbggenerated
     */
    public void setDesc4(String desc4) {
        this.desc4 = desc4 == null ? null : desc4.trim();
    }

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public Byte[] getStatusStrs() {
		return statusStrs;
	}

	public void setStatusStrs(Byte[] statusStrs) {
		this.statusStrs = statusStrs;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getPlancode() {
		return plancode;
	}

	public void setPlancode(String plancode) {
		this.plancode = plancode;
	}

	public Long getCreateTimeBegin() {
		return createTimeBegin;
	}

	public void setCreateTimeBegin(Long createTimeBegin) {
		this.createTimeBegin = createTimeBegin;
	}

	public Long getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Long createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getSignimgurl() {
		return signimgurl;
	}

	public void setSignimgurl(String signimgurl) {
		this.signimgurl = signimgurl;
	}

	public String getOvernumber() {
		return overnumber;
	}

	public void setOvernumber(String overnumber) {
		this.overnumber = overnumber;
	}

	public String getTotalnumber() {
		return totalnumber;
	}

	public void setTotalnumber(String totalnumber) {
		this.totalnumber = totalnumber;
	}

	public String getPickupimgurl() {
		return pickupimgurl;
	}

	public void setPickupimgurl(String pickupimgurl) {
		this.pickupimgurl = pickupimgurl;
	}

}