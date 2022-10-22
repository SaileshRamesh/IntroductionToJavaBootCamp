package c_operatorsAndForLoop;

import java.util.Scanner;

public class SquareRoot_Integral {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println(0);
            return;
        }
            
        for(int i = 1 ; i <= n/2 ; i++) {
            if(i*i > n) {
               System.out.println(i - 1); 
               break;  
            } else if(i * i == n) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
	}

}
