package b_patterns;
/**
 * A
   BC
   CDE
 */
import java.util.Scanner;

public class CharPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        int i = 1;
	        while(i <= n) {
	        	//char c = (char)('A'+ i - 1);
	        	char c = (char)('A' + n - i);
	            int j = 1;
	            while(j <= i) {
	                System.out.print(c+" ");
	                c = (char)(c + 1);
	                j++;
	            }
	            System.out.println();
	            i++;
	      }
	      sc.close();
	}

}
