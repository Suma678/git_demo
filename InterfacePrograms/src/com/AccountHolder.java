package com;

public class AccountHolder implements HDFCBank {

	@Override
	public void deposit() {
		System.out.println("Deposited");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawn");
	}
	public static void main(String[] args) {
		
		AccountHolder acc = new AccountHolder();
		
		acc.deposit();
		acc.withdraw();
	}
}
