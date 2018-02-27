/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.domain.converter;

import com.tjt.finance.domain.model.VoucherClauseModel;
import com.tjt.finance.repository.dataobject.VoucherClause;

/**
 *
 * @author 十神
 * @version $Id: DomainConverterImpl.java, v 0.1 2018年02月12日 下午4:02 tianjiatian Exp $
 */
public interface DomainConverter {

    VoucherClause getVoucherClause(VoucherClauseModel model);

    VoucherClauseModel getVoucherClauseModel(VoucherClause voucherClause);

}