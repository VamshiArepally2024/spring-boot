package com.vamshi.bank_ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vamshi.bank_ex.model.SavingAccount;


@Repository
public interface ISavingAccountRepository extends JpaRepository<SavingAccount, Long> {

}
