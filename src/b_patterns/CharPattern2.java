package b_patterns;
/**
 * A
   BB
   CCC
 */
import java.util.Scanner;

public class CharPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        int i = 1;
	        while(i <= n) {
	            int j = 1;
	            while(j <= i) {
	                char c = (char)('A'+ i - 1);
	                System.out.print(c+" ");
	                j++;
	            }
	            System.out.println();
	            i++;
	      }
	      sc.close();
	}

}
