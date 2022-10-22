package e_test;

import java.util.Scanner;
/**
 
*000*000*
0*00*00*0
00*0*0*00
000***000 
 
 * @author Sailesh
 *
 */
public class ZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        int n=s.nextInt();

	        int k,l;  
	        for(k=1;k<=n;k++){ 
	            for(l=1;l<=n;l++){
	                if(k==l)  
	                    System.out.print("*");  
	                else  
	                    System.out.print("0");  
	            }  
	            l--;  
	            System.out.print("*");  
	            while(l>=1){ 
	                if(k==l)  
	                    System.out.print("*");  
	                else  
	                    System.out.print("0");  
	                l--;  
	            }  
	            System.out.println("");  
	        }  
	}

}
