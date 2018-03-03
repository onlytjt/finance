/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 十神
 * @version $Id: VoucherUtil.java, v 0.1 2018年03月03日 下午4:19 tianjiatian Exp $
 */
public class VoucherUtil {

    /**
     * 生成凭证id，20位。日期+8位随机数
     * @return
     */
    public static String getVoucherId() {
        Date current = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateStr = df.format(current);

        int randomInt = (int) (Math.random() * 100000000);
        String randomStr = String.format("%08d", randomInt);
        String voucherId = dateStr + randomStr;

        return voucherId;
    }

    public static void main(String[] args) {
        System.out.println(getVoucherId());
    }
}