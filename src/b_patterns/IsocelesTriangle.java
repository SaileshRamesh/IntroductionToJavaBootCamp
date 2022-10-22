package b_patterns;

import java.util.Scanner;
/**
 * 1
  232
 34543
4567654
 * @author Sailesh
 *
 */
public class IsocelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
        	int space = 1;
        	while(space <= n - i) {
        		System.out.print(' ');
        		space++;
        	}
        	int j = 1;
        	while(j <= i) {
        		System.out.print(i+j-1);
        		j++;
        	}
        	j = 1;
        	int val = 2 * i - 2;
        	while(j <= i - 1) {
        		System.out.print(val);
        		val--;
        		j++;
        	}
        	System.out.println();
        	i++;
        }
        sc.close();
	}

}
