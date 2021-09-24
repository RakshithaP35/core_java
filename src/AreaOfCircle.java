import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		 
		        double radius = 0.0;
		        double area = 0.0;
		       
			    Scanner scan = new Scanner(System.in);
		        System.out.print("Enter the radius of circle:: ");
		        radius = scan.nextDouble();

		        area = findCircleArea(radius);
		        System.out.printf("Area of circle = %.2f", area);
		        scan.close();

	}
	public static double findCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
