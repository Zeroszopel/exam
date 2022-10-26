package com.pxu.k18.exam.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.pxu.k18.exam.model.Account;
import com.pxu.k18.exam.repository.AccountRepository;
public class AccountServiceImpl implements AccountService{
	@Autowired
	public AccountRepository accountRepository;
	
	@Override
	public List<Account> findAll(){
		return this.accountRepository.findAll();
	}
	@Override
	public Account findById(int id) {
		return this.accountRepository.findById(id);
	}
	@Override
    public int findAccount(Account Account) {
    	
        return this.accountRepository.findAccount(Account);
    }

	@Override
	public boolean checkAccount(Account Account) {
		// TODO Auto-generated method stub
		 return this.accountRepository.checkAccount(Account);
	}
    
}
