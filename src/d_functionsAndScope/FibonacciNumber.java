package d_functionsAndScope;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkMember(n));
		sc.close();
	}

	public static boolean checkMember(int n) {
		int a = 0, b = 1, c;
		while (a < n) {
			c = a + b;
			a = b;
			b = c;
		}
		if (a == n) {
			return true;
		} else {
			return false;
		}

	}
}
