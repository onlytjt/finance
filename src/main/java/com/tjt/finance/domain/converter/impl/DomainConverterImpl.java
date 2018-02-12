/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.domain.converter.impl;

import com.tjt.finance.domain.converter.DomainConverter;
import com.tjt.finance.domain.model.VoucherClauseModel;
import com.tjt.finance.repository.dataobject.VoucherClause;
import org.springframework.stereotype.Service;

/**
 *
 * @author 十神
 * @version $Id: DomainConverterImpl.java, v 0.1 2018年02月12日 下午4:03 tianjiatian Exp $
 */

@Service
public class DomainConverterImpl implements DomainConverter {
    @Override
    public VoucherClause getVoucherClause(VoucherClauseModel model) {

        VoucherClause voucherClause = new VoucherClause();

        voucherClause.setGmtCreate(model.getGmtCreate());
        voucherClause.setGmtModified(model.getGmtModified());
        voucherClause.setSummary(model.getSummary());
        voucherClause.setCaptionId(model.getCaptionId());
        voucherClause.setCurrency(model.getCurrency());
        voucherClause.setRate(model.getRate());
        voucherClause.setAmount(model.getAmount());
        voucherClause.setAccountDirection(model.getAccountDirection());
        voucherClause.setDebitAmount(model.getDebitAmount());
        voucherClause.setCreditAmount(model.getCreditAmount());

        return voucherClause;
    }

    @Override
    public VoucherClauseModel getVoucherClauseModel(VoucherClause voucherClause) {
        return null;
    }
}