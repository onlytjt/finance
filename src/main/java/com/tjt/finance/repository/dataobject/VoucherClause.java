/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.repository.dataobject;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 十神
 * @version $Id: VoucherClause.java, v 0.1 2018年02月12日 下午2:38 tianjiatian Exp $
 */

@Entity
@Component
public class VoucherClause implements Serializable {

    private static final long serialVersionUID = 7893218412076694753L;

    /** 主键id */
    @Id
    private Integer id;

    /** 凭证id */
    private String voucherId;

    /** 创建日期 */
    private Date gmtCreate;

    /** 最后修改日期 */
    private Date gmtModified;

    /** 摘要 */
    private String summary;

    /** 科目id */
    private String captionId;

    /** 货币种类 */
    private String currency;

    /** 汇率 */
    private String rate;

    /** 原币数量 */
    private String amount;

    /** 记账方向 */
    private String accountDirection;

    /** 借方金额 */
    private Integer debitAmount;

    /** 贷方金额 */
    private Integer creditAmount;

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
     * Getter method for property <tt>summary</tt>.
     * @return property value of summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param summary value to be assigned to property summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Getter method for property <tt>captionId</tt>.
     * @return property value of captionId
     */
    public String getCaptionId() {
        return captionId;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param captionId value to be assigned to property captionId
     */
    public void setCaptionId(String captionId) {
        this.captionId = captionId;
    }

    /**
     * Getter method for property <tt>currency</tt>.
     * @return property value of currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param currency value to be assigned to property currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter method for property <tt>rate</tt>.
     * @return property value of rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param rate value to be assigned to property rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * Getter method for property <tt>amount</tt>.
     * @return property value of amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param amount value to be assigned to property amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter method for property <tt>accountDirection</tt>.
     * @return property value of accountDirection
     */
    public String getAccountDirection() {
        return accountDirection;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param accountDirection value to be assigned to property accountDirection
     */
    public void setAccountDirection(String accountDirection) {
        this.accountDirection = accountDirection;
    }

    /**
     * Getter method for property <tt>debitAmount</tt>.
     * @return property value of debitAmount
     */
    public Integer getDebitAmount() {
        return debitAmount;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param debitAmount value to be assigned to property debitAmount
     */
    public void setDebitAmount(Integer debitAmount) {
        this.debitAmount = debitAmount;
    }

    /**
     * Getter method for property <tt>creditAmount</tt>.
     * @return property value of creditAmount
     */
    public Integer getCreditAmount() {
        return creditAmount;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param creditAmount value to be assigned to property creditAmount
     */
    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }
}