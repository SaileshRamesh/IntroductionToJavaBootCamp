package f_arrays;

import java.util.Scanner;

/**
 You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
 You need to print their intersection; 
 An intersection for this problem can be defined when both the arrays/lists contain a particular
 value or to put it in other words, when there is a common value that exists in both the arrays/lists.

 Input :
 arr1 - 2 6 8 5 4 3
 arr2 - 2 3 4 7 

 Output : 2 4 3

 * @author Sailesh
 *
 */
public class IntersectionOfArrays {

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
		intersections(arr, arr1);
		sc.close();
	}

	public static void intersections(int arr1[], int arr2[]) {
		//Your code goes here

		for(int i = 0 ; i < arr1.length ; i++) {
			for(int j = 0 ; j < arr2.length ; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
}
