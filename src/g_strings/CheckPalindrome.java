package g_strings;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static boolean isPalindrome(String str) {
		//Your code goes here
        int n = str.length();
        int i = 0;
        int j = n - 1;
        while(i <= n/2) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
	}
}
