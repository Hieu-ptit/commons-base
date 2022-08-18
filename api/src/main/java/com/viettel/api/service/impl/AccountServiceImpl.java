package com.viettel.api.service.impl;

import com.viettel.api.mapper.Entity2AccountRequestMapper;
import com.viettel.api.model.entity.Account;
import com.viettel.api.model.request.AccountRequest;
import com.viettel.api.repository.AccountRepository;
import com.viettel.api.service.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void create(AccountRequest request) {
        Account account = new Account().setEmail(request.getEmail())
                        .setName(request.getName()).setPassword(request.getPassword());
        accountRepository.insert(account);
    }
}
