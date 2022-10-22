package f_arrays_2;

import java.util.Scanner;
/**
 Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. 
 Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). 
 The idea here is to represent each array/list as an integer in itself of digits N and M.

 Input
 arr1 = 6 2 4
 arr2 = 7 5 6

 Output = 1 3 8 0
 *
 */
public class SumOfTwoArrays {

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
		int[] output = new int[1 + Math.max(arr.length, arr1.length)];
		sumOfTwoArrays(arr, arr1, output);
		for(int i = 0 ; i < output.length ; i++) {
			System.out.print(output[i]+" ");
		}
		sc.close();
	}

	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		//Your code goes here
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = output.length - 1;
		int carry = 0;

		while (k >= 0) {
			int sum = 0;
			if(i >= 0) {
				sum += arr1[i];
			}
			if(j >= 0) {
				sum += arr2[j];
			}
			sum += carry;

			carry = sum / 10;
			sum = sum % 10;
			output[k] = sum;

			i--;
			j--;
			k--;
		}
		if(carry > 0) {
			output[0] = carry;
		}
	}
}
