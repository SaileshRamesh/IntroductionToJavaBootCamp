package g_strings;

import java.util.Scanner;

/**
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest 
frequency character, the answer would be 'a'.
 *
 */
public class HighestOccurenceOfCharacter {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int[] freq = new int[256];

		for(int i = 0 ; i < 256 ; i++) {
			freq[i] = 0;
		}

		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			++freq[ch];
		}

		int max = Integer.MIN_VALUE;
		int charValue = 0;
		for(int i = 0 ; i < 256 ; i++) {
			if(freq[i] > max) {
				max = freq[i];
				charValue = i;
			}
		}
		char ans = (char)charValue;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(highestOccuringChar(str));
		sc.close();
	}

}
