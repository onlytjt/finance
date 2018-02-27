/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.controller;

import com.tjt.finance.core.FinanceConstants;
import com.tjt.finance.domain.converter.DomainConverter;
import com.tjt.finance.domain.model.VoucherInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 十神
 * @version $Id: VoucherController.java, v 0.1 2018年02月12日 下午2:32 tianjiatian Exp $
 */

@Controller
public class VoucherController {

    @Autowired
    private DomainConverter domainConverter;

    @RequestMapping(FinanceConstants.SUBMIT_VOUCHER)
    public void submitVoucher(VoucherInfoModel voucherInfoModel) {
        System.out.println("this is submit");
        System.out.println(voucherInfoModel.toString());
    }

    @RequestMapping(FinanceConstants.QUERY_VOUCHER)
    public ModelAndView queryVoucher() {
        ModelAndView model = new ModelAndView("addVoucher");
        VoucherInfoModel voucherModel = new VoucherInfoModel();
        model.addObject("voucherModel", voucherModel);
        return model;
    }


}