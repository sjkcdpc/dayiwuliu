package com.tianrui.service.bean;

import java.util.List;

public class SystemMember {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.id
     *
     * @mbggenerated
     */
    private String id;
    
    private List<String> ids;
    /** 安联认证后的司机id*/
    private String aldriverid;
    /**
     * 微信唯一标识
     */
    private String openid;
    /** 会员名称 仅后台管理使用*/
    private String remarkname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.cellphone
     *
     * @mbggenerated
     */
    private String cellphone;
    /**
     * 推荐人
     */
    private String referrer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.registtime
     *
     * @mbggenerated
     */
    private Long registtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.lasttime
     *
     * @mbggenerated
     */
    private Long lasttime;
    
    private Long submittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.orgid
     *
     * @mbggenerated
     */
    private String orgid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.loginname
     *
     * @mbggenerated
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.avatarspath
     *
     * @mbggenerated
     */
    private String avatarspath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.sourcetype
     *
     * @mbggenerated
     */
    private Short sourcetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.userpercheck
     *
     * @mbggenerated
     */
    private Short userpercheck;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.driverpercheck
     *
     * @mbggenerated
     */
    private Short driverpercheck;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.companypercheck
     *
     * @mbggenerated
     */
    private Short companypercheck;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.id
     *
     * @return the value of member.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.id
     *
     * @param id the value for member.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.cellphone
     *
     * @return the value of member.cellphone
     *
     * @mbggenerated
     */
    public String getCellphone() {
        return cellphone;
    }

    public String getReferrer() {
		return referrer;
	}

	public Long getSubmittime() {
		return submittime;
	}

	public void setSubmittime(Long submittime) {
		this.submittime = submittime;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.cellphone
     *
     * @param cellphone the value for member.cellphone
     *
     * @mbggenerated
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.password
     *
     * @return the value of member.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.password
     *
     * @param password the value for member.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.status
     *
     * @return the value of member.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.status
     *
     * @param status the value for member.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAldriverid() {
		return aldriverid;
	}

	public void setAldriverid(String aldriverid) {
		this.aldriverid = aldriverid;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.registtime
     *
     * @return the value of member.registtime
     *
     * @mbggenerated
     */
    public Long getRegisttime() {
        return registtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.registtime
     *
     * @param registtime the value for member.registtime
     *
     * @mbggenerated
     */
    public void setRegisttime(Long registtime) {
        this.registtime = registtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.lasttime
     *
     * @return the value of member.lasttime
     *
     * @mbggenerated
     */
    public Long getLasttime() {
        return lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.lasttime
     *
     * @param lasttime the value for member.lasttime
     *
     * @mbggenerated
     */
    public void setLasttime(Long lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.orgid
     *
     * @return the value of member.orgid
     *
     * @mbggenerated
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.orgid
     *
     * @param orgid the value for member.orgid
     *
     * @mbggenerated
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.nickname
     *
     * @return the value of member.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.nickname
     *
     * @param nickname the value for member.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.loginname
     *
     * @return the value of member.loginname
     *
     * @mbggenerated
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.loginname
     *
     * @param loginname the value for member.loginname
     *
     * @mbggenerated
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.sex
     *
     * @return the value of member.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.sex
     *
     * @param sex the value for member.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.avatarspath
     *
     * @return the value of member.avatarspath
     *
     * @mbggenerated
     */
    public String getAvatarspath() {
        return avatarspath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.avatarspath
     *
     * @param avatarspath the value for member.avatarspath
     *
     * @mbggenerated
     */
    public void setAvatarspath(String avatarspath) {
        this.avatarspath = avatarspath == null ? null : avatarspath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.sourcetype
     *
     * @return the value of member.sourcetype
     *
     * @mbggenerated
     */
    public Short getSourcetype() {
        return sourcetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.sourcetype
     *
     * @param sourcetype the value for member.sourcetype
     *
     * @mbggenerated
     */
    public void setSourcetype(Short sourcetype) {
        this.sourcetype = sourcetype ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.userpercheck
     *
     * @return the value of member.userpercheck
     *
     * @mbggenerated
     */
    public Short getUserpercheck() {
        return userpercheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.userpercheck
     *
     * @param userpercheck the value for member.userpercheck
     *
     * @mbggenerated
     */
    public void setUserpercheck(Short userpercheck) {
        this.userpercheck = userpercheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.driverpercheck
     *
     * @return the value of member.driverpercheck
     *
     * @mbggenerated
     */
    public Short getDriverpercheck() {
        return driverpercheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.driverpercheck
     *
     * @param driverpercheck the value for member.driverpercheck
     *
     * @mbggenerated
     */
    public void setDriverpercheck(Short driverpercheck) {
        this.driverpercheck = driverpercheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.companypercheck
     *
     * @return the value of member.companypercheck
     *
     * @mbggenerated
     */
    public Short getCompanypercheck() {
        return companypercheck;
    }

    public String getRemarkname() {
		return remarkname;
	}

	public void setRemarkname(String remarkname) {
		this.remarkname = remarkname;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.companypercheck
     *
     * @param companypercheck the value for member.companypercheck
     *
     * @mbggenerated
     */
    public void setCompanypercheck(Short companypercheck) {
        this.companypercheck = companypercheck;
    }

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}
    
}