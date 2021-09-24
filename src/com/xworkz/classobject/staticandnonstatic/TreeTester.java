package com.xworkz.classobject.staticandnonstatic;

public class TreeTester {

	public static void main(String[] args) {
		Tree tree= new Tree();
		System.out.println(tree.name);		
		System.out.println(tree.noOfTree);
		tree.oxygen();
		tree.wood();
		Door.protection();
	}

}
