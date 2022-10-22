package f_arrays_2;

import java.util.Scanner;

public class Algo_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		for(int i = 0 ; i < n ; i++) {
			System.out.printf(arr[i] + " ");
		}
		sc.close();
	}

	public static void insertionSort(int[] arr) {
		//Your code goes here
		int n = arr.length;

		for(int i = 1 ; i < n ; i++) {

			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}         
	}
}
