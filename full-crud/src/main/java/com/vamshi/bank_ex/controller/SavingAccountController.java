package com.vamshi.bank_ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamshi.bank_ex.model.SavingAccount;
import com.vamshi.bank_ex.service.ISavingAccountService;

@RestController
@RequestMapping("/savingaccounts")
public class SavingAccountController {

	@Autowired
	private ISavingAccountService service;

	@PostMapping("/add")

	public SavingAccount addSavingAccount(@RequestBody SavingAccount savingAccount) {
		return service.createSavingAccount(savingAccount);

	}

	@GetMapping("/account/{id}")

	public SavingAccount getSavingAccount(@PathVariable long id) {
		return service.getSavingAccountById(id);

	}

	@GetMapping

	public List<SavingAccount> getAllSavingAccounts() {
		return service.getAllSavingAccounts();

	}

	@PostMapping("/update/{id}")

	public SavingAccount updateSavingAccount(@RequestBody SavingAccount savingAccount, @PathVariable Long id) {
		return service.updateSavingAccount(savingAccount, id);

	}

	@DeleteMapping("/delete/{id}")

	public void deleteSavingAccountById(@PathVariable Long id) {
		service.deleteAccount(id);

	}

}
