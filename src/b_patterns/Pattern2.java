package b_patterns;

import java.util.Scanner;
/**
 * Program to print a pattern like n*n
 * 1 1 1 
   2 2 2 
   3 3 3 
 * @author Sailesh
 *
 */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
        	int j = 1;
        	while(j <= n) {
        		System.out.print(i+" ");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
        sc.close();
        		
	}

}
