package f_arrays;

import java.util.Scanner;

/**
 You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.

Input - 2 3 1 6 3 6 2
Output - 1 
 *
 */
public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findUnique(arr));
		sc.close();
	}

	public static int findUnique(int[] arr){
		//Your code goes here

		if(arr.length == 1){
			return arr[0];
		}

		for(int i = 0 ; i < arr.length ; i++){
			int count = 0 ;
			for(int j = 0 ; j < arr.length ;j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}
			if(count != 2){
				return arr[i];
			}
		}
		return -1 ;
	}
}
