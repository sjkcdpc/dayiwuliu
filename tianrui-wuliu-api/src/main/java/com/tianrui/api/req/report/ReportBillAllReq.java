package com.tianrui.api.req.report;

public class ReportBillAllReq {
    private String id;
    // 1-司机，2-车主，3-货主
    private String reportType;
    
    private Long hyTime;
    
    private Double hyDistance;
    
    private String billOwnerId;

    private String billVenderId;

    private String billDriverId;

    private String billReceiveId;
    
    private Integer pageNo;
    
    private Integer pageSize;

    private String billType;

    private String businessTime;

    private String planNo;

    private String billNo;

    private String sendMan;

    private String sendPersion;

    private String receiptMan;

    private String receiptPersion;

    private String vehicleNo;

    private String cargoName;

    private String routeName;

    private String distinct;

    private String venderWeight;

    private String pickupWeight;

    private String unloadWeight;

    private String trueWeight;

    private String billStatus;

    private String driverName;

    private String payMent;

    private Long billCreaterTime;

    private Long acceptTime;

    private Long pickupTime;

    private Long unloadTime;

    private Long signTime;

    private String desc1;

    private String desc2;

    private String desc3;

    private String desc4;
    
    private String ownerName;
    
    private String businessTimeStart;
    private String businessTimeEnd;
    private String billCreaterTimeStart;
    private String billCreaterTimeEnd;
    private String acceptTimeStart;
    private String acceptTimeEnd;
    private String pickupTimeStart;
    private String pickupTimeEnd;
    private String unloadTimeStart;
    private String unloadTimeEndtime;
    private String signTimeStart;
    private String signTimeEnd;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime == null ? null : businessTime.trim();
    }

    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo == null ? null : planNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getSendMan() {
        return sendMan;
    }

    public void setSendMan(String sendMan) {
        this.sendMan = sendMan == null ? null : sendMan.trim();
    }

    public String getSendPersion() {
        return sendPersion;
    }

    public void setSendPersion(String sendPersion) {
        this.sendPersion = sendPersion == null ? null : sendPersion.trim();
    }

    public String getReceiptMan() {
        return receiptMan;
    }

    public void setReceiptMan(String receiptMan) {
        this.receiptMan = receiptMan == null ? null : receiptMan.trim();
    }

    public String getReceiptPersion() {
        return receiptPersion;
    }

    public void setReceiptPersion(String receiptPersion) {
        this.receiptPersion = receiptPersion == null ? null : receiptPersion.trim();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName == null ? null : cargoName.trim();
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct == null ? null : distinct.trim();
    }

    public String getVenderWeight() {
        return venderWeight;
    }

    public void setVenderWeight(String venderWeight) {
        this.venderWeight = venderWeight == null ? null : venderWeight.trim();
    }

    public String getPickupWeight() {
        return pickupWeight;
    }

    public void setPickupWeight(String pickupWeight) {
        this.pickupWeight = pickupWeight == null ? null : pickupWeight.trim();
    }

    public String getUnloadWeight() {
        return unloadWeight;
    }

    public void setUnloadWeight(String unloadWeight) {
        this.unloadWeight = unloadWeight == null ? null : unloadWeight.trim();
    }

    public String getTrueWeight() {
        return trueWeight;
    }

    public void setTrueWeight(String trueWeight) {
        this.trueWeight = trueWeight == null ? null : trueWeight.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getPayMent() {
        return payMent;
    }

    public void setPayMent(String payMent) {
        this.payMent = payMent == null ? null : payMent.trim();
    }

    public Long getBillCreaterTime() {
        return billCreaterTime;
    }

    public void setBillCreaterTime(Long billCreaterTime) {
        this.billCreaterTime = billCreaterTime;
    }

    public Long getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Long acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Long getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Long pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Long getUnloadTime() {
        return unloadTime;
    }

    public void setUnloadTime(Long unloadTime) {
        this.unloadTime = unloadTime;
    }

    public Long getSignTime() {
        return signTime;
    }

    public void setSignTime(Long signTime) {
        this.signTime = signTime;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1 == null ? null : desc1.trim();
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2 == null ? null : desc2.trim();
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3 == null ? null : desc3.trim();
    }

    public String getDesc4() {
        return desc4;
    }

    public void setDesc4(String desc4) {
        this.desc4 = desc4 == null ? null : desc4.trim();
    }

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getBusinessTimeStart() {
		return businessTimeStart;
	}

	public void setBusinessTimeStart(String businessTimeStart) {
		this.businessTimeStart = businessTimeStart;
	}

	public String getBusinessTimeEnd() {
		return businessTimeEnd;
	}

	public void setBusinessTimeEnd(String businessTimeEnd) {
		this.businessTimeEnd = businessTimeEnd;
	}

	public String getBillCreaterTimeStart() {
		return billCreaterTimeStart;
	}

	public void setBillCreaterTimeStart(String billCreaterTimeStart) {
		this.billCreaterTimeStart = billCreaterTimeStart;
	}

	public String getBillCreaterTimeEnd() {
		return billCreaterTimeEnd;
	}

	public void setBillCreaterTimeEnd(String billCreaterTimeEnd) {
		this.billCreaterTimeEnd = billCreaterTimeEnd;
	}

	public String getAcceptTimeStart() {
		return acceptTimeStart;
	}

	public void setAcceptTimeStart(String acceptTimeStart) {
		this.acceptTimeStart = acceptTimeStart;
	}

	public String getAcceptTimeEnd() {
		return acceptTimeEnd;
	}

	public void setAcceptTimeEnd(String acceptTimeEnd) {
		this.acceptTimeEnd = acceptTimeEnd;
	}

	public String getPickupTimeStart() {
		return pickupTimeStart;
	}

	public void setPickupTimeStart(String pickupTimeStart) {
		this.pickupTimeStart = pickupTimeStart;
	}

	public String getPickupTimeEnd() {
		return pickupTimeEnd;
	}

	public void setPickupTimeEnd(String pickupTimeEnd) {
		this.pickupTimeEnd = pickupTimeEnd;
	}

	public String getUnloadTimeStart() {
		return unloadTimeStart;
	}

	public void setUnloadTimeStart(String unloadTimeStart) {
		this.unloadTimeStart = unloadTimeStart;
	}

	public String getUnloadTimeEndtime() {
		return unloadTimeEndtime;
	}

	public void setUnloadTimeEndtime(String unloadTimeEndtime) {
		this.unloadTimeEndtime = unloadTimeEndtime;
	}

	public String getSignTimeStart() {
		return signTimeStart;
	}

	public void setSignTimeStart(String signTimeStart) {
		this.signTimeStart = signTimeStart;
	}

	public String getSignTimeEnd() {
		return signTimeEnd;
	}

	public void setSignTimeEnd(String signTimeEnd) {
		this.signTimeEnd = signTimeEnd;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getBillOwnerId() {
		return billOwnerId;
	}

	public void setBillOwnerId(String billOwnerId) {
		this.billOwnerId = billOwnerId;
	}

	public String getBillVenderId() {
		return billVenderId;
	}

	public void setBillVenderId(String billVenderId) {
		this.billVenderId = billVenderId;
	}

	public String getBillDriverId() {
		return billDriverId;
	}

	public void setBillDriverId(String billDriverId) {
		this.billDriverId = billDriverId;
	}

	public String getBillReceiveId() {
		return billReceiveId;
	}

	public void setBillReceiveId(String billReceiveId) {
		this.billReceiveId = billReceiveId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Double getHyDistance() {
		return hyDistance;
	}

	public void setHyDistance(Double hyDistance) {
		this.hyDistance = hyDistance;
	}

	public Long getHyTime() {
		return hyTime;
	}

	public void setHyTime(Long hyTime) {
		this.hyTime = hyTime;
	}
}