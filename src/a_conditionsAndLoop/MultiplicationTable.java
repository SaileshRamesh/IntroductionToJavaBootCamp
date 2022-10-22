package a_conditionsAndLoop;

import java.util.Scanner;
/**
 * First 10 multiples of n each printed in new line
 * @author Sailesh
 *
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int i = 1;
        while(i <= 10) {
            System.out.println(N * i);
            i++;
        }
        sc.close();
	}

}
