package f_arrays_2;

import java.util.Scanner;

/**
 You have been given an integer array/list(ARR) of size N. 
 It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, 
the index from which the array/list has been rotated.

Input = 5 6 1 2 3 4

Output = 2
 *
 */
public class CheckArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arrayRotateCheck(arr));
		sc.close();
	}

	public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++) {
            if(arr[i] > arr[i+1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
