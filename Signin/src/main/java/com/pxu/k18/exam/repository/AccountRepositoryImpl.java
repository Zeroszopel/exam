package com.pxu.k18.exam.repository;
import java.util.*;

import com.pxu.k18.exam.model.Account;
public class AccountRepositoryImpl implements AccountRepository{
	private static final Map<Integer, Account> accounts;
	static {
		accounts = new HashMap<>();
		accounts.put(1,new Account(1,"Admin","secure1412","Hoàng"));
		accounts.put(2,new Account(2,"User","newaccount","Hiền"));
		}
	@Override
	public List<Account> findAll(){
		return new ArrayList<>(accounts.values());
	}
	
	@Override
	public Account findById(int id) {
		Account account = accounts.get(id);
		return account;
	}
	@Override
	public int findAccount(Account Account) {
		// TODO Auto-generated method stub
		int a=0;
		for(Map.Entry<Integer, Account> item : accounts.entrySet()) {
			if(item.getValue().getUsername().toString().equals(Account.getUsername().toString())
			&& item.getValue().getPassword().toString().equals(Account.getPassword().toString())) {
			a=item.getKey();
			break;
			}
		}
		return a;
	}

	@Override
	public boolean checkAccount(Account Account) {
		// TODO Auto-generated method stub
			boolean a = true;
		
		for(Map.Entry<Integer, Account> item : accounts.entrySet()) {
			if(item.getValue().getUsername().toString().equals(Account.getUsername().toString())) {
			a = false;
			break;
			}
		}
		return a;
	}
	
}
