package e_test;

import java.util.Scanner;

/**
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
 * @author Sailesh
 *
 */
public class CheckAmstrong {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		int toCount = n;
		int ans = 0;
		int count = 0;
        sc.close();
		while(toCount > 0) {
			int rem = toCount % 10;
			toCount = toCount / 10;
			count++;
		}
		while(n > 0) {
			int rem = n % 10;
			ans += Math.pow(rem,count);
			n = n / 10;
		}
		if(original == ans){
			System.out.print("true");
		}else{
			System.out.print("false");
		}
	}

}
