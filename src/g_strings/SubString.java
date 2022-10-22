package g_strings;

import java.util.Scanner;

/**
 For a given input string(str), write a function to print all the possible substrings.
 A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, 
"cdng" is not as the characters taken are not contiguous

Input - abc
Output 
a 
ab 
abc 
b 
bc 
c 
 *
 */
public class SubString {

	public static void printSubstrings(String str) {
		//Your code goes here
		int n = str.length();
		int i = 0;
		while(i < n) {
			int j = i;
			while(j < n) {
				System.out.println(str.substring(i, j + 1));
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubstrings(str);
		sc.close();
	}
}
