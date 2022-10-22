package h_twoDimensionalArray;

import java.util.Scanner;

/**
For a given two-dimensional square matrix of size (N x N). 
Find the total sum of elements on both the diagonals and at all the four boundaries.

Input
1 2 3
4 5 6
7 8 9

Output
45
 *
 */
public class TotalSumOnBoundaries {
	
	public static void totalSum(int[][] mat) {
		//Your code goes here
       int requiredSum = 0;
       int N = mat.length;
        
        for (int i = 0; i < N; i++) {
     
            for (int j = 0; j < N; j++) {
     
                if (i == j || (i + j) == N - 1) {
                    requiredSum += mat[i][j];
                }
     
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += mat[i][j];
                }
            }
        }
        System.out.println(requiredSum);
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
		totalSum(mat);
		sc.close();
	}

}
