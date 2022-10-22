package h_twoDimensionalArray;

import java.util.Scanner;
/**
 For a given two-dimensional integer array/list of size (N x M), 
 you need to find out which row or column has the largest sum(sum of all the elements in a row/column)
 amongst all the rows and columns.
 
 Note : 
 If there are more than one rows/columns with maximum sum, consider the row/column that comes first. 
 And if ith row and jth column has the same largest sum, consider the ith row as answer.
 
 Input 
1 1 
1 1

Output
row 0 2

Input
3 6 9 
1 4 7 
2 8 9

Output
column 2 25
 *
 */
public class LargestRowOrColumn {
	
	public static void findLargest(int mat[][]){
		//Your code goes here
        int row = mat.length;
        int col;
        if(row > 1) {
           col = mat[0].length;
        }else {
            col = 0;
        }
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowNo = 0;
        int maxColSum = Integer.MIN_VALUE;
        int maxColNo = 0;
        
        if(row == 0 && col == 0) {
            System.out.print("row "+maxRowNo+" "+maxRowSum);
            return;
        }
        
        for(int i = 0 ; i < row ; i++) {
            int sum = 0;
            for(int j = 0 ; j < col ; j++) {
                sum += mat[i][j];
            }
            if(maxRowSum < sum) {
                maxRowSum = sum;
                maxRowNo = i;
            }
        }
        
        for(int j = 0 ; j < col ; j++) {
            int tempSum = 0;
            for(int i = 0 ; i < row ; i++) {
                tempSum += mat[i][j];
            }
            if(maxColSum < tempSum) {
                maxColSum = tempSum;
                maxColNo = j;
            }
        }
        
        if(maxRowSum > maxColSum) {
            System.out.print("row "+maxRowNo+" "+maxRowSum);
        } else if(maxRowSum < maxColSum) {
            System.out.print("column "+maxColNo+" "+maxColSum);
        } else {
            System.out.print("row "+maxRowNo+" "+maxRowSum);
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
		findLargest(mat);
		sc.close();
	}

}
