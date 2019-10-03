package com.bjb.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bjb.dto.Account;

@Service
public interface AccountService {
	public Optional<Account> getAccountById(long accountId);
}
