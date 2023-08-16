package com.mtd.bankingapi.app.cus.dao;

import com.mtd.bankingapi.app.cus.entity.CusCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CusCustomerDao extends JpaRepository<CusCustomer, Long> {
    Optional<CusCustomer> findByIdentityNo(Long identityNo);
}
