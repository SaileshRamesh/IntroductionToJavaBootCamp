package b_patterns;

import java.util.Scanner;

/**
 * 1
   21
   321
   4321
 * @author Sailesh
 *
 */
public class TriangleReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
            int j = 1;
            int p = 0;
            while(j <= i) {
                System.out.print(i - p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
	}

}
