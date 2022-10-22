package h_twoDimensionalArray;

import java.util.Scanner;

/**
 For a given two-dimensional integer array/list of size (N x M), 
 find and print the sum of each of the row elements in a single line, separated by a single space.
 Input -
1 2 
3 4 
5 6 
7 8

Output -
3 7 11 15 
 *
 */
public class RowWiseSum {
	
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        for(int i = 0 ; i < mat.length ; i++) {
            int sum = 0;
            for(int j = 0 ; j < mat[0].length ; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum+" ");
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
		rowWiseSum(mat);
		sc.close();
	}

}
