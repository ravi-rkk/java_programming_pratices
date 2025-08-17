package Baisc_Programming;

import java.util.Scanner;

public class Closest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number");
           Integer a = sc.nextInt();
           System.out.println("Enter the number by which you divisble");
           Integer m = sc.nextInt();
            int div =1;
           for(int i = 1; i<a;i++) {
        	   if(a%m == 0) {
        		   System.out.println("FOund it" +a);
        	   }
        	   
           }
	}

}
