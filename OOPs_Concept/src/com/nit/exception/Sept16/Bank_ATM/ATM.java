package com.nit.exception.Sept16.Bank_ATM;

import java.util.Scanner;

import com.nit.exception.Sept16.Bank_Customer.Customer;
import com.nit.exception.Sept16.Bank_Implementations.BankAccount;

public class ATM {

	public static void main(String[] args) {
		Customer mike=new Customer("Mike","SBI121324");
		BankAccount sbi=new BankAccount(2000,mike.getAccount());
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Select an option :\n"
					+ "\t1. Deposit \n"
					+ "\t2. Withdraw \n"
					+ "\t3. Transfer \n"
					+ "\t4. Loan Application \n"
					+ "\t5. Check Balance \n"
					+ "\t6. Exit ");
			System.out.println("Enter your Option : ");
			String num=sc.next();
			int opt=Integer.parseInt(num);
			System.out.println("Enter amount to Deposit : ");
			int amount=sc.nextInt();
			
			switch(opt)
			{
				case 1:
						sbi.deposit(amount);
						break;
				case 2:
						sbi.withdraw(amount);
						break;
				case 3:
						sbi.transfer(sbi, amount);
						break;
				case 4:
						sbi.applyForLoan(amount);
						break;
				case 5: 
						System.out.println("Current Balance : "+sbi.getBalance());
						break;
				case 6:
						break;
				default:
					System.out.println("Invalid Operation");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
