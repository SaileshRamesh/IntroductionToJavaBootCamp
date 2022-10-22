package a_conditionsAndLoop;
/**
 * Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
 * you need to convert all Fahrenheit values from Start to End at the gap of W,
 * into their corresponding Celsius values and print the table.
 */
import java.util.Scanner;

public class FahrenhietToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int startFhValue = sc.nextInt();
	        int endFhValue = sc.nextInt();
	        int gap = sc.nextInt();
	        printFhCelciusTable(startFhValue,endFhValue,gap);
	        sc.close();
	}
	
	private static void printFhCelciusTable(int startFhValue, int endFhValue, int gap) {
		while(startFhValue <= endFhValue) {
            int correspondingCelcius = (startFhValue - 32) * 5/9;
            System.out.println(startFhValue+" "+correspondingCelcius);
            startFhValue += gap;
        }
	}
}
