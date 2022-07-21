package com.lq.bank;

interface BankAccount {
	int getBalance();
	int getAvailBalance();
	boolean deposit (int amt);
	boolean withdaw(int amt);
}
