package f_arrays;

import java.util.Scanner;

/**
You have been given an integer array/list(ARR) and a number X. 
Find and return the total number of pairs in the array/list which sum to X.
Input
arr = 1 3 6 2 5 4 3 2 4
Int x = 7
Output - 7
 */
public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(pairSum(arr,x));
		sc.close();
	}
	public static int pairSum(int arr[], int x) {
		//Your code goes here
		int n = arr.length;
		int count = 0;
		for(int i = 0 ; i < n - 1 ; i++) {
			for(int j = i + 1 ; j <= n - 1 ; j++) {
				if(arr[i] + arr[j] == x) {
					count++;
				}
			}
		}
		return count;
	}
}
