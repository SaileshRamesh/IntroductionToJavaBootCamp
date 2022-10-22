package i_test_2;

import java.util.Scanner;

/**
Given an integer array A of size n. Find and print all the leaders present in the input array. 
An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) 
are less than or equal to A[i].
Print all the leader elements separated by space and in the same order they are present in the input array.

Input = 3 12 34 2 0 -1
Output = 34 2 0 -1

Input = 13 17 5 4 6
Output = 17 6
 *
 */
public class LeadersInArray {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		int n = input.length;
		for (int i = 0; i < n - 1; i++) {
			boolean leader = true;

			//Checking whether arr[i] is greater than all the elements in its right side
			for (int j = i + 1; j < n; j++)
				if (input[j] > input[i]) {
					leader = false;
					break;
				}

			if (leader)
				System.out.print(input[i] + " ");
		}
		System.out.print(input[n - 1] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		leaders(arr);
		sc.close();
	}
}
