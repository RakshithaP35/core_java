import java.util.Scanner;

public class CheckingEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number for check odd or even: ");

		int num=scan.nextInt();
		findOddeven(num);
	}
	static void findOddeven(int num){
		if(num%2==0) 
    System.out.println(num+" is even"); 
		else 
    System.out.println(num+" is odd");
	}
}
