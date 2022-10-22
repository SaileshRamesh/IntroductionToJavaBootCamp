package f_arrays_2;

import java.util.Scanner;

/**
 You have been given a random integer array/list(ARR) of size N. 
 You have been required to push all the zeros that are present in the array/list to the end of it. 
 Also, make sure to maintain the relative order of the non-zero elements.

 Input = 2 0 0 1 3 0 0

 Output = 2 1 3 0 0 0 0

 *
 */
public class PushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		pushZerosAtEnd(arr);
		for(int i = 0 ; i < n ; i++) {
			System.out.printf(arr[i] + " ");
		}
		sc.close();
	}

	public static void pushZerosAtEnd(int[] arr) {
		//Your code goes here
		int n = arr.length;
		int i = 0;
		int k = 0;
		while (i < n) {
			if(arr[i] == 0){
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k++;
			}
		}
	}
}
