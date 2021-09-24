package com.xworkz.methodoverloading;

public class WalletTester {

	public static void main(String[] args) {
		
		Wallet wallet = new Wallet();
		wallet.store();
		wallet.store(1000);
		wallet.store(1050, 10);
		
	}
// 1 custom object and perform method overloading
}
