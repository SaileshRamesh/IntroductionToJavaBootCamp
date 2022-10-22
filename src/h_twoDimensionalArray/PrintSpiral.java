package h_twoDimensionalArray;

import java.util.Scanner;

/**
 For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. 
 That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)

Input 
1 2 3 
4 5 6 
7 8 9

Output
1 2 3 6 9 8 7 4 5 
 * @author Sailesh
 *
 */
public class PrintSpiral {
	
	public static void spiralPrint(int matrix[][]){
        //Your code goes here
        if(matrix.length == 0) {
            return;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            
            for(int i = colBegin ; i <= colEnd ; i++) {
                System.out.print(matrix[rowBegin][i]+" ");
            }
            rowBegin++;
            
            for(int i = rowBegin ; i <= rowEnd ; i++) {
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd--;
            
            if(rowBegin <= rowEnd) {
                for(int i = colEnd ; i >= colBegin ; i--) {
                    System.out.print(matrix[rowEnd][i]+" ");
                }
            }
            rowEnd--;
            
            if(colBegin <= colEnd) {
                for(int i = rowEnd ; i >= rowBegin ; i--) {
                    System.out.print(matrix[i][colBegin]+" ");
                }
            }
            colBegin++;
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
		spiralPrint(mat);
		sc.close();
	}

}
