package Easy_Programmign_question;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number");
          int a = sc.nextInt();
          System.out.println("Enter the first number");
          int b = sc.nextInt();
          int gcd =1;
          for(int i = 1; i<= a&& i<=b;i++) {
        	  if(a%i==0&&b%i==0) {
        		  gcd =i;
        	  }
        	  
        	  
          }
          System.out.println("GCD are:-"+gcd);
     
	}

}
