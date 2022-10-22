package f_arrays;

import java.util.Scanner;

/**
 * If you find the element in that array just return the index
 * @author Sailesh
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int ele = sc.nextInt();
		System.out.println(findElement(arr, ele));
        sc.close();
	}
	
	public static int findElement(int[] arr, int x) {
		for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
	}

}
