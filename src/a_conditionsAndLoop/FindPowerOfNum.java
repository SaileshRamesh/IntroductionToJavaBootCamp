package a_conditionsAndLoop;

import java.util.Scanner;
/**
 * Write a program to find x to the power n (i.e. x^n). Take x and n from the user. 
 * You need to print the answer.
  Note : For this question, you can assume that 0 raised to the power of 0 is 1
 * @author Sailesh
 *
 */
public class FindPowerOfNum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        if(x == 0 && n == 0) {
            System.out.println(1);
            return;
        }
        
        int power = 1;
        int i = 1;
        while(i <= n) {
            power *= x; 
            i++;
        }
        System.out.println(power);
        sc.close();
	}

}
