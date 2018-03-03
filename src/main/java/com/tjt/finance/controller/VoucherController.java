/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.tjt.finance.controller.checker.InputChecker;
import com.tjt.finance.core.config.FinanceConstants;
import com.tjt.finance.core.model.Result;
import com.tjt.finance.core.service.VoucherService;
import com.tjt.finance.domain.model.VoucherInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 十神
 * @version $Id: VoucherController.java, v 0.1 2018年02月12日 下午2:32 tianjiatian Exp $
 */

@RestController
public class VoucherController {

    @Autowired
    private VoucherService voucherService;

    @RequestMapping(value = FinanceConstants.CREATE_VOUCHER, method = RequestMethod.POST)
    public Map<String, String> submitVoucher(@RequestParam("formData") String voucherInfoStr) {
        Map<String, String> response = new HashMap<>();
        try {
            VoucherInfoModel voucherInfoModel = JSON.parseObject(voucherInfoStr, new TypeReference<VoucherInfoModel>() {});
            InputChecker.voucherInputCheck(voucherInfoModel);
            Result<String> result = voucherService.createVoucher(voucherInfoModel);

            if (result != null && result.isSuccess()) {
                response.put("success", "true");
                response.put("voucherId", result.getData());
            }
            return response;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @RequestMapping(FinanceConstants.QUERY_VOUCHER)
    public Map<String, Object> queryVoucher() {
        Map<String, Object> response = new HashMap<>();
        try {
            Result<List<VoucherInfoModel>> result = voucherService.queryVoucherList();
            if (result != null && result.isSuccess()) {
                response.put("success", "true");
                response.put("voucherList", result.getData());
            }
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}