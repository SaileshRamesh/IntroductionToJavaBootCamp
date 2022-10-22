package f_arrays;
import java.util.Scanner;
/**
You have been given a random integer array/list(ARR) and a number X. 
Find and return the number of triplets in the array/list which sum to X.
Input arr = 1 2 3 4 5 6 7 
Int x = 12
Output = 5
 */
public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(findTriplet(arr,x));
		sc.close();
	}
	public static int findTriplet(int[] arr, int x) {
		//Your code goes here
		int n = arr.length;
		int count = 0;
		for(int i = 0 ; i < n - 2 ; i++) {
			for(int j = i + 1 ; j < n - 1 ; j++) {
				for(int k = j + 1 ; k <= n - 1 ; k++) {
					if(arr[i] + arr[j] + arr[k] == x) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
