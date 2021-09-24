
public class ArithmeticOp {

	public static void main(String[] args) {
		int a=6, b=12;
		int sum1 = addTwoNum( a, b);
		int sum2 = subTwoNum(a, b);
		int sum3 = mulTwoNum(a, b);
		int sum4 = divTwoNum(a, b);
		int sum5= modTwoNum(a, b);
		
		System.out.println(sum1 + " is the addition of two number");
		System.out.println(sum2 + " is the subtraction of two number");
		System.out.println(sum3 + " is the multiplication of two number");
		System.out.println(sum4 + " is the division of two number");
		System.out.println(sum5 + " is the modulus of two number");
	}
	
	
	public static int addTwoNum(int a, int b){
		int sum1 = a+b;
		return sum1;
	}
	public static int subTwoNum(int a, int b){
		int sum2 = a-b;
		return sum2;
	}
	public static int mulTwoNum(int a, int b){
		int sum3 = a*b;
		return sum3;
	}
	public static int divTwoNum(int a, int b){
		int sum4 = a/b;
		return sum4;
	}
	public static int modTwoNum(int a, int b){
		int sum5 = a%b;
		return sum5;

	}

}
