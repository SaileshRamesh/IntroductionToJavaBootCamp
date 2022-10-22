package f_arrays_2;

import java.util.Scanner;

public class Algo_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(binarySearch(arr,x));
		sc.close();
	}
   
	public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == x){
                return mid;
            }else if(x < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
