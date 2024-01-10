package com.vamshi.bank_ex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bank_ex.exception.SavingAccountNotFoundException;
import com.vamshi.bank_ex.model.SavingAccount;
import com.vamshi.bank_ex.repository.ISavingAccountRepository;

@Service
public class SavingAccountServiceImpl implements ISavingAccountService {

	@Autowired
	private ISavingAccountRepository repo;

	@Override
	public SavingAccount createSavingAccount(SavingAccount savingAccount) {
		// TODO Auto-generated method stub
		return repo.save(savingAccount);
	}

	@Override
	public List<SavingAccount> getAllSavingAccounts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public SavingAccount getSavingAccountById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new SavingAccountNotFoundException("account not found"));
	}

	@Override
	public SavingAccount updateSavingAccount(SavingAccount savingAccount, long id) {

		return repo.findById(id).map(account -> {
			account.setAcc_holder_name(savingAccount.getAcc_holder_name());
			account.setAcc_bal(savingAccount.getAcc_bal());
			account.setBranch_name(savingAccount.getBranch_name());
			account.setIfsc_code(savingAccount.getIfsc_code());

			return repo.save(account);

		}).orElseThrow(() -> new SavingAccountNotFoundException("sorry this acccount could not be found..." + id));
	}

	@Override
	public void deleteAccount(long id) {
		if (!repo.existsById(id)) {
			throw new SavingAccountNotFoundException("sorry student not foud");
		}
		repo.deleteById(id);

	}

}
