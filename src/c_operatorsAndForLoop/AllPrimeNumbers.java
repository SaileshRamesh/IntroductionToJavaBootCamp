package c_operatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	       for (int i = 2; i <= n; i++) {
	           
	            if (i == 1 || i == 0)
	                continue;
	            
	            int flag = 1;
	 
	            for (int j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    flag = 0;
	                    break;
	                }
	            }
	 
	            if (flag == 1)
	                System.out.println(i);
	        }
	       sc.close();
	}

}
