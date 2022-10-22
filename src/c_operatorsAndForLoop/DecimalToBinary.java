package c_operatorsAndForLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        long ans = 0, pv = 1;
	        while(n > 0) {
	            int rem = n % 2;
	            ans += (rem * pv);
	            pv *= 10;
	            n = n / 2;
	        }
	        System.out.println(ans);
	        s.close();
	}

}
