package b_patterns;

import java.util.Scanner;

public class DiffStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        int n1 = (n+1)/2;
	        int n2 = (n/2);
	        
	        int i = 1;
	        while(i <= n1) {
	            int space = 1;
	            while(space <= n1 - i) {
	                System.out.print(' ');
	                space++;
	            }
	            int star = 1;
	            while(star <= (2*i -1)) {
	                System.out.print('*');
	                star++;
	            }
	            System.out.println();
	            i++;
	        }
	        
	        int i2 = n2;
	        while(i2 >= 1) {
	            int space2 = 1;
	            while(space2 <= (n2 - i2 +1)) {
	                System.out.print(' ');
	                space2++;
	            }
	            int star2 = 1;
	            while(star2 <= (2*i2 -1)) {
	                System.out.print('*');
	                star2++;
	            }
	            System.out.println();
	            i2--;
	        }
	        s.close();
	}

}
/**
 * Divide the star pattern into 2 halfs
 * one half is (n+1)/2 and other one is (n/2) or n1 - 1
 * run the loop till n1 that is first half
 * row no:  space           stars
 * 1          3(n1 - i)       1(2i - 1)s
 * 2          2               3
 * 3          1               5
 * 4          0               7
 * second half
 * row no:  spaces          stars
 * 3          1(n2-i-1)       5(2i - 1)  
 * 2          2               3
 * 1          3               1
 */




