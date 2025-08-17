package Baisc_Programming;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Number");
          Integer n = sc.nextInt();
          if(n<0) {
        	  System.out.println("pls input the correct number");
          }
          if((2%n)==0) {
        	  System.out.println("Even");
        	  
          }
          else {
        	  System.out.println("Odd");
          }
	}

}
