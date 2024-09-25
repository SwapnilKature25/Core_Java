package com.nit.exception.Sept16.Bank_requirements;

import com.nit.exception.Sept16.BankCustomException.AccountNotFoundException;
import com.nit.exception.Sept16.BankCustomException.InsufficientFundsException;
import com.nit.exception.Sept16.BankCustomException.InvalidAmountException;
import com.nit.exception.Sept16.BankCustomException.LoanNotAllowedException;
import com.nit.exception.Sept16.Bank_Implementations.BankAccount;

public interface BankRequirements {
	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
	void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
	public double getBalance();
}
