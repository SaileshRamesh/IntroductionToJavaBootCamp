package a_conditionsAndLoop;

import java.util.Scanner;
/**
 * Write a program to print all the factors of a number other than 1 and the number itself.
 * @author Sailesh
 *
 */
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		sc.close();
	}

}
