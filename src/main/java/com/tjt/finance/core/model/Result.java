/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.core.model;

import java.io.Serializable;

/**
 *
 * @author 十神
 * @version $Id: Result.java, v 0.1 2018年03月03日 下午4:15 tianjiatian Exp $
 */
public class Result<T> implements Serializable {

    private boolean success = false;

    private String errCode;

    private String errMsg;

    private T data;

    /**
     * Getter method for property <tt>success</tt>.
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>errCode</tt>.
     * @return property value of errCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param errCode value to be assigned to property errCode
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * Getter method for property <tt>errMsg</tt>.
     * @return property value of errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param errMsg value to be assigned to property errMsg
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    /**
     * Getter method for property <tt>data</tt>.
     * @return property value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     * @param data value to be assigned to property data
     */
    public void setData(T data) {
        this.data = data;
    }
}