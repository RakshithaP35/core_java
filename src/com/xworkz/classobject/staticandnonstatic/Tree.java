package com.xworkz.classobject.staticandnonstatic;

public class Tree {
	String name;
	int noOfTree;
	float height;
	
	Tree(){
		this("MangoTree",8);
		System.out.println("defalut");
	}
	
	Tree(String name, int noOfTree){
		this(name,noOfTree,65.5f);
	}
	Tree(String name, int noOfTree, float height){
		this.name= name;
		this.noOfTree =noOfTree;
		this.height = height;
		oxygen();
	}
	void oxygen() {
		System.out.println("Tree gives us oxygen");
		Door.open();
	}
	
	void wood() {
		System.out.println("from tree we can get woods ");
		oxygen();
	}
}
