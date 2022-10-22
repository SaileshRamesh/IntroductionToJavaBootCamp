package d_functionsAndScope;

import java.util.Scanner;

/**
 * Given three values - Start Fahrenheit Value (S), 
 * End Fahrenheit value (E) and Step Size (W), 
 * you need to convert all Fahrenheit values from Start to End at the gap of W, 
 * into their corresponding Celsius values and print the table.
 * @author Sailesh
 *
 */
public class FahrenToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
	    printFahrenheitTable(start, end, step);
	    sc.close();
	}
	public static void printFahrenheitTable(int start, int end, int step) {
		 while(start <= end) {
             int celcius = ((start - 32)*5)/9;
             System.out.println(start+"\t"+celcius);
             start += step;
         }
	}
}


