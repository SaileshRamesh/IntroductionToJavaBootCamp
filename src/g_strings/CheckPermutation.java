package g_strings;

import java.util.Scanner;

/**
 For a given two strings, 'str1' and 'str2', 
 check whether they are a permutation of each other or not.
 Two strings are said to be a permutation of each other when either 
 of the string's characters can be rearranged so that it becomes identical to the other one.
 Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say 
that the given strings are a permutation of each other.

Input - 
abcde
baedc

Ouptut - true
 *
 */
public class CheckPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
         if(str1.length() != str2.length()) {
             return false;
         }
        
        int[] freq = new int[256];
        
        for(int i = 0 ; i < 256 ; i++) {
            freq[i] = 0;
        }
        
        for(int i = 0 ; i < str1.length() ; i++) {
            char ch = str1.charAt(i);
            ++freq[ch];
        }
        
        for(int i = 0 ; i < str2.length() ; i++) {
            char ch = str2.charAt(i);
            --freq[ch];
        }
        
        for(int i = 0 ; i < 256 ; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(isPermutation(str1, str2));
		sc.close();

	}

}
