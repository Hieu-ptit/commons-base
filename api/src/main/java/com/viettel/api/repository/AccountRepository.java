package com.viettel.api.repository;

import com.viettel.api.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, InsertUpdateRepository<Account> {
}
