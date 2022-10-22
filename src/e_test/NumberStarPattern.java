package e_test;

import java.util.Scanner;

/**
 *  5432*
    543*1
    54*21
    5*321
    *4321
 * @author Sailesh
 *
 */
public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        int i = 1;
	        while(i <= n){
	            int j = n;
	            while(j > i){
	                System.out.print(j);
	                j--;
	            }
	            System.out.print('*');
	            int k = i - 1;
	            while(k > 0){
	                System.out.print(k);
	                k--;
	            }
	            System.out.println();
	            i++;
	        }
	        sc.close();
	}

}
