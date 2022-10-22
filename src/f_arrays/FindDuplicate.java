package f_arrays;

import java.util.Scanner;

/**
 You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
 Each number is present at least once. That is, if N = 5, 
 the array/list constitutes values ranging from 0 to 3 and among these, 
 there is a single integer value that is present twice. 
 You need to find and return that duplicate number present in the array.
 Input - 0 7 2 5 4 7 1 3 6
 Output - 7
 */
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0 ; i < n ; i++) {
	        	arr[i] = sc.nextInt();
	        }
	        System.out.println(duplicateNumber(arr));
	        sc.close();
	}
    
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
         if(arr.length == 1){
            return arr[0];
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < arr.length ;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count == 2){
                return arr[i];
            }
        }
        return -1 ;
    }
}
