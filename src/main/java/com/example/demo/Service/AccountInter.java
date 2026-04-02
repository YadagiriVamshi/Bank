package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Accounts;

public interface AccountInter {
	Accounts create(Accounts account);
	Accounts getid(int id);
	List<Accounts> getall();
	Accounts update(int id,Accounts account);
	void delete(int id);

}
