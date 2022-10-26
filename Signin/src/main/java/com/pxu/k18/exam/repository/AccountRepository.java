package com.pxu.k18.exam.repository;

import java.util.List;

import com.pxu.k18.exam.model.Account;

public interface AccountRepository {
	List<Account> findAll();
	Account findById(int id);
	int findAccount(Account Account);
	boolean checkAccount(Account Account);
}
