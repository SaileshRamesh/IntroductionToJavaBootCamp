package b_patterns;

import java.util.Scanner;
/**
 *       1
        232
       34543
      4567654
 */
public class DiffTriangleNumbers {

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
        		System.out.print(i + j - 1);
        		j++;
        	}
        	int dec = 1;
        	while(dec <= i - 1) {
        		System.out.print(i+j-3);
        		j--;
        		dec++;
        	}
        	System.out.println();
        	i++;
        }
        sc.close();
	}

}
