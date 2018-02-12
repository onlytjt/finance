/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.controller;

import com.tjt.finance.core.FinanceConstants;
import com.tjt.finance.domain.converter.DomainConverter;
import com.tjt.finance.domain.model.VoucherClauseModel;
import com.tjt.finance.repository.dataobject.VoucherClause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 十神
 * @version $Id: VoucherController.java, v 0.1 2018年02月12日 下午2:32 tianjiatian Exp $
 */

@Controller
public class VoucherController {

    @Autowired
    private DomainConverter domainConverter;

    @RequestMapping(FinanceConstants.ADD_VOUCHER)
    public void addVoucher(VoucherClauseModel voucherClauseModel) {
        VoucherClause voucherClause = domainConverter.getVoucherClause(voucherClauseModel);
        System.out.println(voucherClause);
    }
}