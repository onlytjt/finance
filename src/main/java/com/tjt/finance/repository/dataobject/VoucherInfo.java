/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.repository.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 十神
 * @version $Id: VoucherInfo.java, v 0.1 2018年02月12日 上午11:05 tianjiatian Exp $
 */
public class VoucherInfo implements Serializable {
    private static final long serialVersionUID = -4165890148885064249L;

    /** 主键id */
    private Integer id;

    /** 凭证id */
    private String voucherId;

    /** 凭证序号 */
    private String voucherSerial;

    /** 创建时间 */
    private Date gmtCreate;

    /** 最后修改时间 */
    private Date gmtModified;

    /** 公司名称 */
    private String company;

    /** 制单人 */
    private String creattorName;

    /** 审核人 */
    private String checkerName;

    /** 记账人 */
    private String accountorName;

    /** 附件张数 */
    private String attachNum;


    /**
     * Getter method for property <tt>id</tt>.
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>voucherId</tt>.
     * @return property value of voucherId
     */
    public String getVoucherId() {
        return voucherId;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param voucherId value to be assigned to property voucherId
     */
    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * Getter method for property <tt>voucherSerial</tt>.
     * @return property value of voucherSerial
     */
    public String getVoucherSerial() {
        return voucherSerial;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param voucherSerial value to be assigned to property voucherSerial
     */
    public void setVoucherSerial(String voucherSerial) {
        this.voucherSerial = voucherSerial;
    }

    /**
     * Getter method for property <tt>gmtCreate</tt>.
     * @return property value of gmtCreate
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param gmtCreate value to be assigned to property gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * Getter method for property <tt>gmtModified</tt>.
     * @return property value of gmtModified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param gmtModified value to be assigned to property gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * Getter method for property <tt>company</tt>.
     * @return property value of company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param company value to be assigned to property company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Getter method for property <tt>creattorName</tt>.
     * @return property value of creattorName
     */
    public String getCreattorName() {
        return creattorName;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param creattorName value to be assigned to property creattorName
     */
    public void setCreattorName(String creattorName) {
        this.creattorName = creattorName;
    }

    /**
     * Getter method for property <tt>checkerName</tt>.
     * @return property value of checkerName
     */
    public String getCheckerName() {
        return checkerName;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param checkerName value to be assigned to property checkerName
     */
    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    /**
     * Getter method for property <tt>accountorName</tt>.
     * @return property value of accountorName
     */
    public String getAccountorName() {
        return accountorName;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param accountorName value to be assigned to property accountorName
     */
    public void setAccountorName(String accountorName) {
        this.accountorName = accountorName;
    }

    /**
     * Getter method for property <tt>attachNum</tt>.
     * @return property value of attachNum
     */
    public String getAttachNum() {
        return attachNum;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param attachNum value to be assigned to property attachNum
     */
    public void setAttachNum(String attachNum) {
        this.attachNum = attachNum;
    }
}