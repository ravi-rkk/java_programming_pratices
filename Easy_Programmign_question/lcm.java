package Easy_Programmign_question;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1st number:-");
            int  a = sc.nextInt();
            System.out.println("Enter the 2nd number:-");
            int  b = sc.nextInt();
            int gcd =1;
            int lcm =0;
            for(int i = 1;i<=a&&i<=b;++i) {
            	if(a%i==0 && b%i==0) {
            		
            			gcd = i;
            			lcm = (a*b)/gcd; 
            		
            	}
            	
            }
            System.out.println("lcm:-" +lcm);
            
            
	}

}
