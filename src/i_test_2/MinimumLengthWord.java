package i_test_2;

import java.util.Scanner;
/**
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format : this is test string
Output Format : is
 *
 */
public class MinimumLengthWord {

	public static String minLengthWord(String input){
		String[] str = input.split(" ");

		String shortest=input; 

		for (String word:str){
			if (word.length()<shortest.length()) {
				shortest=word;

			}
		}
		return shortest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(minLengthWord(str));
		sc.close();
	}

}
