package c_operatorsAndForLoop;
/**
 * Write a program that asks the user for a number N and a choice C. 
 * And then give them the possibility to choose between computing the sum
 * and computing the product of all integers in the range 1 to N (both inclusive).
 */
import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        
        if(C == 1) {
           int sum = 0;
           for(int i = 0 ; i <= N ; i++) {
               sum += i;
           }
           System.out.println(sum);
        } else if (C == 2) {
            int product = 1;
            for(int j = 1 ; j <= N ; j++) {
                product *= j;
            }
            System.out.println(product);
            
        } else {
            System.out.println(-1);
        }
        sc.close();
	}

}
