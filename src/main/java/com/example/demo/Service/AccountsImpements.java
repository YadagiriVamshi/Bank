package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Accounts;
import com.example.demo.Repository.AccountRepo;

@Service
public class AccountsImpements implements AccountInter {
	@Autowired
	private AccountRepo repo;

	@Override
	public Accounts create(Accounts account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}

	@Override
	public Accounts getid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public List<Accounts> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Accounts update(int id, Accounts account) {
		// TODO Auto-generated method stub
		Accounts existing=repo.findById(id).orElseThrow();
		existing.setName(account.getName());
		existing.setBalance(account.getBalance());
		return repo.save(existing);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}
	

}
