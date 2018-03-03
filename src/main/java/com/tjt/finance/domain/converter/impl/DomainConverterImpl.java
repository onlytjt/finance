/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.domain.converter.impl;

import com.tjt.finance.domain.converter.DomainConverter;
import com.tjt.finance.domain.model.VoucherClauseModel;
import com.tjt.finance.domain.model.VoucherInfoModel;
import com.tjt.finance.repository.dataobject.VoucherClause;
import com.tjt.finance.repository.dataobject.VoucherInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: DomainConverterImpl.java, v 0.1 2018年02月12日 下午4:03 tianjiatian Exp $
 */

@Service
public class DomainConverterImpl implements DomainConverter {
    @Override
    public List<VoucherClause> convertVoucherClauseList2Do(VoucherInfoModel model) {

        List<VoucherClauseModel> voucherClauseModelList = model.getVoucherClauseModelList();
        List<VoucherClause> voucherClauseList = new ArrayList<>();
        for (VoucherClauseModel voucherClauseModel : voucherClauseModelList) {
            VoucherClause voucherClause = convertVoucherClause2Do(voucherClauseModel);
            voucherClause.setVoucherId(model.getVoucherId());
            voucherClauseList.add(voucherClause);
        }
        return voucherClauseList;
    }

    @Override
    public VoucherInfo convertVoucherInfo2Do(VoucherInfoModel model) {
        VoucherInfo voucherInfo = new VoucherInfo();

        voucherInfo.setVoucherId(model.getVoucherId());
        voucherInfo.setVoucherSerial(model.getVoucherSerial());
        voucherInfo.setCompany(model.getCompany());
        voucherInfo.setCreatorName(model.getCreatorName());
        voucherInfo.setCheckerName(model.getCheckerName());
        voucherInfo.setAccountorName(model.getAccountorName());
        voucherInfo.setAttachNum(model.getAttachNum());

        return voucherInfo;
    }

    private VoucherClause convertVoucherClause2Do(VoucherClauseModel voucherClauseModel) {
        VoucherClause voucherClause = new VoucherClause();

        voucherClause.setSummary(voucherClauseModel.getSummary());
        voucherClause.setCaptionId(voucherClauseModel.getCaptionId());
        voucherClause.setCurrency(voucherClauseModel.getCurrency());
        voucherClause.setRate(voucherClauseModel.getRate());
        voucherClause.setAmount(voucherClauseModel.getAmount());
        voucherClause.setAccountDirection(voucherClauseModel.getAccountDirection());
        voucherClause.setDebitAmount(voucherClauseModel.getDebitAmount());
        voucherClause.setCreditAmount(voucherClauseModel.getCreditAmount());

        return voucherClause;
    }

    @Override
    public List<VoucherInfoModel> getVoucherInfoModelList(List<VoucherInfo> voucherInfoList) {
        List<VoucherInfoModel> voucherInfoModelList = new ArrayList<>();
        for (VoucherInfo voucherInfo : voucherInfoList) {
            voucherInfoModelList.add(getVoucherInfoModel(voucherInfo));
        }
        return voucherInfoModelList;
    }

    private VoucherInfoModel getVoucherInfoModel(VoucherInfo voucherInfo) {
        VoucherInfoModel voucherInfoModel = new VoucherInfoModel();

        voucherInfoModel.setVoucherId(voucherInfo.getVoucherId());
        voucherInfoModel.setVoucherSerial(voucherInfo.getVoucherSerial());
        voucherInfoModel.setGmtCreate(voucherInfo.getGmtCreate());
        voucherInfoModel.setGmtModified(voucherInfo.getGmtModified());
        voucherInfoModel.setCompany(voucherInfo.getCompany());
        voucherInfoModel.setCreatorName(voucherInfo.getCreatorName());
        voucherInfoModel.setCheckerName(voucherInfo.getCheckerName());
        voucherInfoModel.setAccountorName(voucherInfo.getAccountorName());
        voucherInfoModel.setAttachNum(voucherInfo.getAttachNum());

        return voucherInfoModel;
    }
}