package com.xworkz.accessmodifier.general;

public class FindingGreatestNum  {

	public static void findingGreatestNum(int a, int b, int c)
	{
		System.out.println("the numbers are : " + a + ", " + b + " , " +c);
		
		if(a > b && a > c)
			System.out.println(a + "is the greatest");
		else if( b > c )
			System.out.println(b + " is the greatest");
		else
			System.out.println(c + " is the greatest");
		
	}
 public static void main(String [] args) {
	 findingGreatestNum(2, 3, 4);
	 String varName= args[ 0];
	  String varName2 = args[1 ];
	  String varName3 = args[2 ];
	 System.out.println(varName);
	 System.out.println(varName2);
	 System.out.println(varName3);

	
 }
}
