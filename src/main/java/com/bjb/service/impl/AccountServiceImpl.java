package com.bjb.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bjb.dto.Account;
import com.bjb.repository.AccountServiceRepository;
import com.bjb.service.AccountService;

public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountServiceRepository accountServiceRepository;
	
	@Override
	public Optional<Account> getAccountById(long accountId) {
		return accountServiceRepository.findById(accountId);
	}

}
