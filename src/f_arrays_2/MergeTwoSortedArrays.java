package f_arrays_2;

import java.util.Scanner;
/**
 You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
 merge them into a third array/list such that the third array is also sorted.

 Input arr1 = 1 3 4 7 11
 Input arr2 = 2 4 6 13

 Output = 1 2 3 4 4 6 7 11 13 

 *
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for(int i = 0 ; i < m ; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] ans = merge(arr,arr1);
		for(int i = 0 ; i < n+m ; i++) {
			System.out.print(ans[i]+" ");
		}
		sc.close();
	}

	public static int[] merge(int arr1[], int arr2[]) {
		//Your code goes here
		int n = arr1.length;
		int m = arr2.length;
		int[] arr3 = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;

		while(i < n && j < m) {
			if(arr1[i] <= arr2[j]){
				arr3[k] = arr1[i];
				i++;
				k++;
			}else{
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i < n) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j < m) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}
}
