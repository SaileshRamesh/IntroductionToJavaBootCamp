package g_strings;
/**
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".

Input - Welcome to Coding Ninjas
Output - emocleW ot gnidoC sajniN

 * @author Sailesh
 *
 */
public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		//Your code goes here
		String ans = "";
		int crrStart = 0;
		int i = 0;
		for(; i < str.length() ; i++) {
			if(str.charAt(i) == ' ') {
				int crrEnd = i - 1;
				String reverse = "";
				for(int j = crrEnd ; j >= crrStart ; j--) {
					reverse += str.charAt(j); 
				}
				ans += reverse + " ";
				crrStart = i + 1;
			}
		}
		int crrEnd = i - 1;
		String reverse = "";
		for(int j = crrEnd ; j >= crrStart ; j--) {
			reverse += str.charAt(j); 
		}
		ans += reverse;

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
