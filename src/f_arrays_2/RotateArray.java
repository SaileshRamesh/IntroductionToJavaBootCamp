package f_arrays_2;

import java.util.Scanner;
/**
 You have been given a random integer array/list(ARR) of size N.
 Write a function that rotates the given array/list by D elements(towards the left).

Input
Arr = 1 2 3 4 5 6 7
Int d = 2

Output = 3 4 5 6 7 1 2

 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		rotate(arr, d);
		for(int i = 0 ; i < n ; i++) {
			System.out.printf(arr[i] + " ");
		}
		sc.close();
	}

	public static void rotate(int[] arr, int d) {
		//Your code goes here
		int n = arr.length;
		int[] temp = new int[d];
		for(int i = 0 ; i < d ; i++ ) {
			temp[i] = arr[i];
		}
		for(int j= 0 ; j<=((n-1)- d) ; j++) { 
			arr[j]= arr[j+ d];
		}
		int f = 0;
		for(int k =(n- d); k < n ; k++){
			arr[k] = temp[f];
			f++;
		}

	}
}
