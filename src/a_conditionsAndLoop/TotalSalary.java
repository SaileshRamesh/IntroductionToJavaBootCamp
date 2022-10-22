package a_conditionsAndLoop;
/**
 * The user has to enter the basic salary (an integer) and the grade (an uppercase character),
 *  and depending upon which the total salary is calculated as -
 *      totalSalary = basic + hra + da + allow – pf
 *      hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
 */
import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        String grade = sc.next();
        double allow;
        
        switch(grade) {
            case "A":
                allow = 1700;
                break;
            case "B":
                allow = 1500;
                break;
            default : 
                allow = 1300;
        }
        double hra = basic * 0.2;
        double da = basic * 0.5;
        double pf = basic * 0.11;
        
        int totalSalary = (int)Math.round((basic + hra + da + allow) - pf);
        System.out.println(totalSalary); 
        sc.close();
	}

}
