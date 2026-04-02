package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Accounts;
import com.example.demo.Service.AccountInter;

@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "*")
public class Accountscontroller {
	@Autowired
	private AccountInter servi;
	@PostMapping("/create")
	public Accounts cre(@RequestBody Accounts account) {
		return servi.create(account);
	}
	
	@GetMapping("/{id}")
	public Accounts get(@PathVariable int id) {
		return servi.getid(id);
	}
	@GetMapping
	public List<Accounts> geta() {
		return servi.getall();
	}
	@PutMapping("/{id}")
	public Accounts upd(@PathVariable int id,@RequestBody Accounts account) {
		return servi.update(id, account);
	}
	@DeleteMapping("/{id}")
	public void dele(@PathVariable int id) {
		servi.delete(id);
	}

}
