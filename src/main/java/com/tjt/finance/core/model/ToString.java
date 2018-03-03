/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.core.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 *
 * @author 十神
 * @version $Id: ToString.java, v 0.1 2018年03月03日 下午3:05 tianjiatian Exp $
 */
public abstract class ToString implements Serializable {

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}