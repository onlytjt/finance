/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.repository.repo;

import com.tjt.finance.repository.dataobject.VoucherInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: VoucherInfoRepository.java, v 0.1 2018年02月12日 上午11:38 tianjiatian Exp $
 */
public interface VoucherInfoRepository extends JpaRepository<VoucherInfo, Integer> {

    List<VoucherInfo> findByVoucherId(String voucherId);
}