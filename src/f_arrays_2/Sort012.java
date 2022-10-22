package f_arrays_2;

import java.util.Scanner;
/**
You are given an integer array/list(ARR) of size N. 
It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.

Input = 0 1 2 0 1 2 0

Output = 0 0 0 1 1 2 2
 */
public class Sort012 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		sort012(arr);
		for(int i = 0 ; i < n ; i++) {
			System.out.printf(arr[i] + " ");
		}
		sc.close();
	}

	public static void sort012(int[] arr){
		//Your code goes here
		int i = 0;
		int n = arr.length;
		int nz = 0;
		int nt = n - 1;

		while (i <= nt) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[nz];
				arr[nz] = temp;
				i++;
				nz++;
			} else if(arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp;
				nt--;
			} else{
				i++;
			}
		}
	}
}
