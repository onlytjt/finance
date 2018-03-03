/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.core.service;

import com.tjt.finance.core.model.Result;
import com.tjt.finance.domain.model.VoucherInfoModel;

import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: VoucherService.java, v 0.1 2018年03月03日 下午3:59 tianjiatian Exp $
 */

public interface VoucherService {
    Result<String> createVoucher(VoucherInfoModel voucherInfoModel);

    Result<List<VoucherInfoModel>> queryVoucherList();
}