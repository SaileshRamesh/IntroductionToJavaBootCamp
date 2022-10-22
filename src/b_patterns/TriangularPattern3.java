package b_patterns;
/**
 * 1 
   2 3 
   3 4 5 
 */
import java.util.Scanner;

public class TriangularPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
        	int j = 1;
        	int p = i; 
        	while(j <= i) {
        		System.out.print(p+" ");
        		j++;
        		p++;
        	}
        	System.out.println();
        	i++;
        }
        sc.close();
	}

}
