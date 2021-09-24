
public class FindingSmallestNum {

	public static void main(String[] args) {

		System.out.println("print the smallest number");
		int a = 30, b = 40, c = 10;
		findingSmallestnum(a, b, c);
	}

	public static void findingSmallestnum(int a, int b, int c) {
		System.out.println("Smallest number is : " + a + " & " + b + " & " + c + " is:");
		if (a < b && b < c) {
			System.out.println(a + " is the smallest number");
		} else if (b < c) {
			System.out.println(b + " is the smallest number");
		} else {
			System.out.println(c + " is the smallest number");
		}
	}
}
