package c_operatorsAndForLoop;

import java.util.Scanner;

public class DiffCheckNumSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prev = s.nextInt();
		int count = 2, current;
		boolean isDec = true;
		
		while(count <= n) {
			current = s.nextInt();
			count++;
			if(current == prev) {
				System.out.println(false);
				return;
			}
			if(current < prev) {
				if(isDec == false) {
					System.out.println(false);
					return;
				}
			}
			else {
				if(isDec == true) {
					isDec = false;
				}
			}
			prev = current;
			s.close();
		}
		System.out.println(true);
	}
}
