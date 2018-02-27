/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.controller;

import com.tjt.finance.repository.dataobject.VoucherClause;
import com.tjt.finance.repository.repo.VoucherClauseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: HelloController.java, v 0.1 2018年02月09日 下午9:41 tianjiatian Exp $
 */

@RestController
public class TestController {

    @Autowired
    private VoucherClauseRepository voucherClauseRepository;

    @RequestMapping("/queryVoucherClause")
    public List<VoucherClause> hello() {
        return voucherClauseRepository.findVoucherClausesByVoucherId("voucher001");
    }

}