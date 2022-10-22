package g_strings;

import java.util.Scanner;

public class CountWords {
	
	public static int countWords(String str) {	
		//Your code goes here
        if(str.length() == 0) {
            return 0;
        }
        
        int count = 1;
        for(int i = 0 ; i < str.length() - 1 ; i++) { 
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countWords(str));
        sc.close();
	}

}
