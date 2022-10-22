package c_operatorsAndForLoop;

import java.util.Scanner;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int first = 0, second = 1, temp;
		for (int i = 0; i < num; i++) {
			temp = first + second;
			first = second;
			second = temp;
		}
		System.out.println(first);
		sc.close();
	}

}
