package g_strings;

import java.util.Scanner;

/**
Write a program to do basic string compression. For a character which is consecutively
repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.

If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.

Input - aaabbccdsa
Output - a3b2c2dsa

Explanation : In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 
'c' is repeated 2 times and 'd', 's' and 'a' and occuring 1 time hence no compression for last 3 characters.

Input - aaabbcddeeeee
Output - a3b2cd2e5

Explanation : In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is occuring single time, 
'd' is repeating 2 times and 'e' is repeating 5times.
 *
 */
public class CompressString {

	public static String getCompressedString(String str) {
		// Write your code here.
		String ans = "";

		if(str == null) {
			return null;
		}

		if(str.length() == 0) {
			return "";
		}

		ans += str.charAt(0);
		int count = 1;
		int i = 1;
		for( ; i < str.length() ; i++) {
			if(str.charAt(i - 1) == str.charAt(i)) {
				count++;
			}else{
				if(count >= 2) {
					ans += count;
				}
				ans += str.charAt(i);
				count = 1;
			}
		}
		if(count != 1) {
			ans += count;
		}else {
			ans += str.charAt(i-1);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(getCompressedString(str));
		sc.close();
	}
}
