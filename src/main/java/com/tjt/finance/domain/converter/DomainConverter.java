/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.domain.converter;

import com.tjt.finance.domain.model.VoucherClauseModel;
import com.tjt.finance.domain.model.VoucherInfoModel;
import com.tjt.finance.repository.dataobject.VoucherClause;
import com.tjt.finance.repository.dataobject.VoucherInfo;

import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: DomainConverterImpl.java, v 0.1 2018年02月12日 下午4:02 tianjiatian Exp $
 */

public interface DomainConverter {

    VoucherInfo convertVoucherInfo2Do(VoucherInfoModel model);

    List<VoucherClause> convertVoucherClauseList2Do(VoucherInfoModel model);

    List<VoucherInfoModel> getVoucherInfoModelList(List<VoucherInfo> voucherInfoList);
}