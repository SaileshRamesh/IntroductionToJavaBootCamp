package g_strings;

import java.util.Scanner;

/**
For a given string(str), remove all the consecutive duplicate characters.
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"

Input - xxyyzxx
Output - xyzx
 *
 */
public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		String ans = "";

		for(int i = 0 ; i < str.length() - 1 ; i++) {
			if(str.charAt(i) != str.charAt(i + 1)) {
				ans += str.charAt(i);
			} else {
				continue;
			}
		}
		ans += str.charAt(str.length() - 1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));
		sc.close();
	}
}
