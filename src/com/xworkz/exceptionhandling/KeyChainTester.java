package com.xworkz.exceptionhandling;

public class KeyChainTester {

	public static void main(String[] args) {
		KeyChain kc = null;
		KeyChainTester inst = new KeyChainTester();
		inst.myMethod(kc);
	
		
		System.out.println("end prog");
		
	
	}
	void myMethod(KeyChain key) {
		
		System.out.println("Method acessing all the method of keychain");
		key.getColor();
		key.getShape();
		key.getWeightIngrms();
	}

}
