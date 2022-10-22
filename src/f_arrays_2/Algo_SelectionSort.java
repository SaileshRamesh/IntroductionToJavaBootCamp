package f_arrays_2;

import java.util.Scanner;

public class Algo_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		for(int i = 0 ; i < n ; i++) {
			System.out.printf(arr[i] + " ");
		}
		sc.close();
	}

	public static void selectionSort(int[] arr) {
		//Your code goes here
		int n = arr.length;
		int minIndex = 0;
		for(int i = 0 ; i < n - 1 ; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = i ; j < n ; j++) {
				if(min > arr[j]){
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}   
}
