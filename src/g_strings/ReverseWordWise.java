package g_strings;

import java.util.Scanner;

/**
 Reverse the given string word wise. That is, the last word in given string should come 
 at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

 Input - Welcome to Coding Ninjas
 Output - Ninjas Coding to Welcome
 *
 */
public class ReverseWordWise {

	public static String reverseWordWise(String input) {
		// Write your code here
		int n = input.length();
		String reverse = "";
		for(int i = n - 1 ; i >= 0 ; i--) {
			reverse += input.charAt(i);
		}

		String ans = "";
		int crrStart = 0;
		int i = 0;
		for(; i < n ; i++) {
			if(reverse.charAt(i) == ' ') {
				int crrEnd = i - 1;
				String corrtWord = "";
				for(int j = crrEnd ; j >= crrStart ; j--) {
					corrtWord += reverse.charAt(j);
				}
				ans += corrtWord + " ";
				crrStart = i + 1;
			} 
		}

		int crrEnd = i - 1;
		String corrtWord = "";
		for(int j = crrEnd ; j >= crrStart ; j--) {
			corrtWord += reverse.charAt(j);
		}
		ans += corrtWord;

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseWordWise(str));
		sc.close();
	}

}
