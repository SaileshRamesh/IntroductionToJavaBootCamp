package f_arrays_2;

import java.util.Scanner;

/**
You have been given a random integer array/list(ARR) of size N. 
You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31
(It is the smallest value for the range of Integer)

Input = 2 13 4 1 3 6 28

Output = 13
 */
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(secondLargestElement(arr));
		sc.close();
	}

	public static int secondLargestElement(int[] arr) {
		//Your code goes here
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		int n = arr.length;
		int i = 0;
		while(i < n) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} 
			if(arr[i] < largest && arr[i] > secondLargest){
				secondLargest = arr[i];
			}
			i++;
		}
		return secondLargest;
	}
}
