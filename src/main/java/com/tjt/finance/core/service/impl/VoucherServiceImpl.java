/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.core.service.impl;

import com.tjt.finance.core.model.Result;
import com.tjt.finance.core.service.VoucherService;
import com.tjt.finance.core.util.VoucherUtil;
import com.tjt.finance.domain.converter.DomainConverter;
import com.tjt.finance.domain.model.VoucherInfoModel;
import com.tjt.finance.repository.dataobject.VoucherClause;
import com.tjt.finance.repository.dataobject.VoucherInfo;
import com.tjt.finance.repository.repo.VoucherClauseRepository;
import com.tjt.finance.repository.repo.VoucherInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: VoucherServiceImpl.java, v 0.1 2018年03月03日 下午3:57 tianjiatian Exp $
 */

@Service
public class VoucherServiceImpl implements VoucherService {

    @Autowired
    private DomainConverter domainConverter;

    @Autowired
    private VoucherInfoRepository voucherInfoRepository;

    @Autowired
    private VoucherClauseRepository voucherClauseRepository;

    @Override
    public Result<String> createVoucher(VoucherInfoModel voucherInfoModel) {

        String voucherId = VoucherUtil.getVoucherId();
        voucherInfoModel.setVoucherId(voucherId);
        VoucherInfo voucherInfo = domainConverter.convertVoucherInfo2Do(voucherInfoModel);
        List<VoucherClause> voucherClauseList = domainConverter.convertVoucherClauseList2Do(voucherInfoModel);

        voucherInfoRepository.save(voucherInfo);
        voucherClauseRepository.save(voucherClauseList);
        Result<String> result = new Result<>();
        result.setData(voucherId);
        result.setSuccess(true);
        return result;
    }

    @Override
    public Result<List<VoucherInfoModel>> queryVoucherList() {
        List<VoucherInfo> voucherInfoList = voucherInfoRepository.findAll();
        List<VoucherInfoModel> voucherInfoModelList = domainConverter.getVoucherInfoModelList(voucherInfoList);

        Result<List<VoucherInfoModel>> result = new Result<>();
        result.setData(voucherInfoModelList);
        result.setSuccess(true);
        return result;
    }
}