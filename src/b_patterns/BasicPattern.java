package b_patterns;

import java.util.Scanner;
/**
 * Program to print a pattern like n*n
 * @author Sailesh
 *
 */
public class BasicPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
        	int j = 1;
        	while(j <= n) {
        		System.out.print('*'+" ");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
        sc.close();
        		
	}

}
