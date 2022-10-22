package g_strings;

import java.util.Scanner;

/**
 For a given a string(str) and a character X, write a function to remove 
all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.

String - aabccbaa
Character - a

output - bccb
 *
 */
public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) != ch) {
                ans += str.charAt(i);
            }else {
                continue;
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		System.out.println(removeAllOccurrencesOfChar(str, ch));
		sc.close();
	}

}
