package f_arrays;

import java.util.Scanner;
/**
 You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
 Write a function to sort this array/list. Think of a solution which scans the array/list only once
 and don't require use of an extra array/list.

 Input = 0 1 1 0 1 0 1
 Output = 0 0 0 1 1 1 1
 */
public class Sort10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		sortZeroesAndOne(arr);
		sc.close();
	}

	public static void sortZeroesAndOne(int[] arr) {
		//Your code goes here
		int n = arr.length;
		int left = 0, right = n - 1;

		while (left < right)
		{

			while (arr[left] == 0 && left < right)
				left++;


			while (arr[right] == 1 && left < right)
				right--;


			if (left < right)
			{
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}
}
