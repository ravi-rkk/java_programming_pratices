package Baisc_Programming;

import java.util.Scanner;

public class Swap_of_two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Numbers a");
         Integer a = sc.nextInt();
         System.out.println("Enter the Numbers b");
         Integer b = sc.nextInt();
         System.out.println("Your Number are " + a + " and " + b);
        
         int temp = a;
         a= b;
         b= temp;
         System.out.println("The Swap number is a:" + a +" and b:"+ b);
         
	}

}
