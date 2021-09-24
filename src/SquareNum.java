import java.util.Scanner;

public class SquareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		System.out.println("Your squared number is: " + square(num));

	}
	public static int square(int num) 
	{
		return num * num;
	}
}
