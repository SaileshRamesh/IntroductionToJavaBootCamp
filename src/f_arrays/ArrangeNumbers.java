package f_arrays;
import java.util.Scanner;
/**
 * input - 6
 * Output - 1 3 5 6 4 2
 * @author Sailesh
 *
 */
public class ArrangeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		arrange(arr, n);
		printArray(arr, n);
		sc.close(); 
	}
	public static void printArray(int[] arr, int n) {
		for(int i = 0 ; i < n ; i++) {
		    System.out.print(arr[i]+" ");
		}
	}
	public static void arrange(int[] arr, int n) {
        //Your code goes here
        int l=1;
        int m=2;

        for(int i=0;i<n/2;i++)
        {

            arr[i] = l;
            arr[n-i-1] = m;     
            l = l + 2;
            m = m + 2;

        }
        if(n % 2 == 1)
        {
            arr[n/2]=n;
        }

    }

}
