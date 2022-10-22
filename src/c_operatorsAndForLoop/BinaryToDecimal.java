package c_operatorsAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      
        
        int placeValue = 1;
        int ans = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            ans += lastDigit * placeValue;
            n = n / 10;
            placeValue *= 2;
        }
        System.out.print(ans);
        sc.close();
	}

}
