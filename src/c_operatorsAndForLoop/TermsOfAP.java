package c_operatorsAndForLoop;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        
	        for(int i = 1; i <= x+1 ; i++) {
	            int n = ((3 * i) + 2);
	            if(n % 4 != 0) {
	                System.out.print(n+" ");
	            }
	        }
	        sc.close();
	}

}
