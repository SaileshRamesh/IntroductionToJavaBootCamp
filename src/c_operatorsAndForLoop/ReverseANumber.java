package c_operatorsAndForLoop;

import java.util.Scanner;

public class ReverseANumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = false;
        
        if(N == 0) {
            System.out.print(0);
            return;
        }
        
        while (N > 0) {
            int rem = N % 10;
            N = N / 10;
            if(flag == false && rem == 0){
                continue;
            }else {
                System.out.print(rem);
                flag = true;
            }
        }
        sc.close();
	}

}
