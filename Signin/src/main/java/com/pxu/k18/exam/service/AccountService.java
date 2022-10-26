package com.pxu.k18.exam.service;

import java.util.List;

import com.pxu.k18.exam.model.Account;

public interface AccountService {
	List<Account> findAll();
	Account findById(int id);
	int findAccount(Account account);
	boolean checkAccount(Account account);
    
}
