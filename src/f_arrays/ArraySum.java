package f_arrays;
/**
 * Given an array/list(ARR) of length N, 
 * you need to find and return the sum of all the elements in the array/list.
 */
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sum(arr));
        sc.close();
	}
	
	public static int sum(int[] arr) {
		//Your code goes here
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
	}

}
