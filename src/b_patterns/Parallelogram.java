package b_patterns;

import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n) {
            int space = 1;
            while(space < i) {
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while(star <= n) {
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
        }
        sc.close();
	}

}
