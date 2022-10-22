package b_patterns;

import java.util.Scanner;
/**
 * A B C 
   A B C 
   A B C
 * @author Sailesh
 * A value starts from 65
 * a value is 97
 */
public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
        	int j = 1;
        	while(j <= n) {
        		char jthChar = (char)('A' + j - 1);
        		System.out.print(jthChar+" ");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
        sc.close();
	}

}
