/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.repository.repo;

import com.tjt.finance.repository.dataobject.VoucherClause;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author 十神
 * @version $Id: VoucherClauseRepository.java, v 0.1 2018年02月17日 上午11:27 tianjiatian Exp $
 */
public interface VoucherClauseRepository extends JpaRepository<VoucherClause, Integer> {
    List<VoucherClause> findVoucherClausesByVoucherId(String voucherId);

    VoucherClause save(VoucherClause voucherClause);

}