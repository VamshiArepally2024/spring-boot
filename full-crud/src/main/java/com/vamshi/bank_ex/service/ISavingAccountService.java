package com.vamshi.bank_ex.service;

import java.util.List;
import java.util.Optional;

import com.vamshi.bank_ex.model.SavingAccount;

public interface ISavingAccountService {
	// we can write abstract methods ,it means it does not have any body ,these
	// methods are implemented
	// by implemented class

	// create/save the account into the database
	public SavingAccount createSavingAccount(SavingAccount savingAccount);

	// get the account from the database ,here we passing an id

	public List<SavingAccount> getAllSavingAccounts();

	public SavingAccount getSavingAccountById(long id);

	// get the list of accounts from the database ,here we passing an id

	// update the account,

	public SavingAccount updateSavingAccount(SavingAccount savingAccount, long id);

	// delete the saving account

	public void deleteAccount(long id);

}
