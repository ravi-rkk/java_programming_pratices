package Baisc_Programming;

import java.util.Scanner;

public class Sum_of_Natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      Integer n = sc.nextInt();
      int sum = 0;
      for(int i = 1 ; i<=n; i++) {
    	  
    	  sum = sum +(i*i);
      }
      System.out.println("The Sum of natural number " + n+ " is " + sum);
	}

}
