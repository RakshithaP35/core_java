
public class PrimeNum {

	public static void main(String[] args) {
		// int i, j=0, flag =0;
		checkPrime(9);
		checkPrime(227);

	}

	public static void checkPrime(int n) {
		int i, j = 0, flag = 0;
		j = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is a prime");
		} else {
			for (i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime");
			}
		}

	}

}
