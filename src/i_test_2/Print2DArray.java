package i_test_2;

import java.util.Scanner;

/**
Given a 2D integer array with n rows and m columns. 
Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
Input
1 2 3
4 5 6
7 8 9

Output
1 2 3
1 2 3
1 2 3
4 5 6
4 5 6
7 8 9
 *
 */
public class Print2DArray {
	
	public static void print2DArray(int input[][]) {
		// Write your code here
         for (int i=0;i<input.length;i++)
        {
            int count = input.length-i;
            while (count>0)
            {
                for (int j=0;j<input[0].length;j++)
                {
                    System.out.print(input[i][j] + " ");
                }
                count--;
                System.out.println();
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		print2DArray(mat);
		sc.close();
	}

}
