package a_conditionsAndLoop;

import java.util.Scanner;
/**
 * That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
 * @author Sailesh
 *
 */
public class SumOfOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int sumEven = 0, oddSum = 0;
        
        while(num > 0) {
            int rem = num % 10;
            if(rem % 2 == 0) {
                sumEven += rem;
            } else {
                oddSum += rem;
            }
            num = num / 10;
        }
        System.out.println(sumEven+" "+oddSum);
        sc.close();
	}

}
