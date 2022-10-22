package h_twoDimensionalArray;

import java.util.Scanner;

/**
For a given two-dimensional integer array/list of size (N x M), print the array/list 
in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
Input 
1  2  3  4 
5  6  7  8 
9 10 11 12
Output
1 5 9 10 6 2 3 7 11 12 8 4
 *
 */
public class PrintLikeWave {
	
	public static void wavePrint(int mat[][]){
        //Your code goes here
        int m = mat.length;

        if(m == 0) {
            return;
        }
        
        int n = mat[0].length;

        for (int j = 0; j < n; j++) {

            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            }

            else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
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
		wavePrint(mat);
		sc.close();

	}

}
