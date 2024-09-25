package com.nit.exception.Sept16.Bank_Implementations;

import com.nit.exception.Sept16.BankCustomException.AccountNotFoundException;
import com.nit.exception.Sept16.BankCustomException.InsufficientFundsException;
import com.nit.exception.Sept16.BankCustomException.InvalidAmountException;
import com.nit.exception.Sept16.BankCustomException.LoanNotAllowedException;
import com.nit.exception.Sept16.Bank_requirements.BankRequirements;

public class BankAccount implements BankRequirements {
	static double balance;
	
	public BankAccount(double balance,String account){
		this.balance=balance;
	}
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Amount should not be Zero");
		}
		else {
			balance+=amount;
			System.out.println(balance+" Deposited Successfully...");
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount > balance) {
			throw new InsufficientFundsException("Enter valid amount");
		}
		else if(amount <= 0) {
			throw new InvalidAmountException("Amount should not be Zero");
		}
		else {
			balance-=amount;
			System.out.println(balance+" Withdrawn Successfully...");
		}
	}
	
	@Override
	public void transfer(BankAccount toAccount,double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException
	{
		if(amount > balance) {
			throw new InsufficientFundsException("Enter valid amount");
		}
		else if(toAccount == null) {
			throw new AccountNotFoundException("Your other Account not found!!!");
		}
		else if(amount <= 0) {
			throw new InvalidAmountException("Amount should not be Zero");
		}
		else {
			BankAccount.balance = amount;
			System.out.println("Successfuly Money transfered : "+BankAccount.balance );
			
		}
		
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if(amount > 50000 || balance < 50000) {
			throw new LoanNotAllowedException("Your loan amount is exceeds than the limit");
		}
		else if(amount <= 0) {
			throw new InvalidAmountException("Amount should not be Zero");
		}
		else {
			System.out.println("You Loan of "+amount+" is approved");
			balance+=amount;
		}

	}

	@Override
	public double getBalance() {
		return balance;
	}

}
