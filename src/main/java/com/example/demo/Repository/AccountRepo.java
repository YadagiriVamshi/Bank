package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Accounts;

public interface AccountRepo extends JpaRepository<Accounts, Integer> {

}
