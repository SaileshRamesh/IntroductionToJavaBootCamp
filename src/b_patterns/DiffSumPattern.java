package b_patterns;
/**
1=1
1+2=3
1+2+3=6
 */
import java.util.Scanner;

public class DiffSumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        int i = 1;
        while(i <= n) {
            sum = 0;
            int j= 1;
            while(j <= i) {
                sum=sum+j;
                System.out.print(j);
                if(j<i)
                    System.out.print("+");
                j++;
            }
            System.out.print("="+sum);
            System.out.println();
            i++;
        }
        sc.close();
	}

}
