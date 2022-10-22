package a_conditionsAndLoop;

import java.util.Scanner;

/**
 * Write a program that takes a character as input and prints either 1, 0 or -1
 * according to the following rules. 1, if the character is an uppercase
 * alphabet (A - Z) 0, if the character is a lowercase alphabet (a - z) -1, if
 * the character is not an alphabet
 * 
 * @author Sailesh
 *
 */
public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;// variable declaration
		Scanner scan = new Scanner(System.in);

		ch = scan.next().charAt(0);// store the input from the user
		if (ch >= 'A' && ch <= 'Z') {// if it is true ,display upper case
			System.out.println(1);
		} else if (ch >= 'a' && ch <= 'z') {// if it is true ,display lower case
			System.out.println(0);
		} else {
			System.out.println(-1);
		}
		scan.close();
	}

}
