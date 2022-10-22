package a_conditionsAndLoop;

import java.util.Scanner;

/**
 * Class to find the sum of N numbers, User is prompted to enter the input for
 * which the sum is output.
 * 
 * @author Sailesh
 *
 */
public class sumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value till which you want the sum?");
		int N = sc.nextInt();
		System.out.println(sumTillN(N));
		sc.close();
	}

	/**
	 * Method to find the sum of N numbers
	 * 
	 * @param N - Integer
	 * @return - Integer
	 */
	private static int sumTillN(int N) {
		int sum = 0;
		int i = 1;
		while (i <= N) {
			sum += i;
			i++;
		}
		return sum;
	}

}
