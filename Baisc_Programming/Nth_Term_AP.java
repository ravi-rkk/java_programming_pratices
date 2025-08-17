package Baisc_Programming;

import java.util.Scanner;

public class Nth_Term_AP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the first number a1:-");
           int a1 = sc.nextInt();
           System.out.println("Enter the second number a2:-");
           int a2 = sc.nextInt();
           System.out.println("which nth term you want:-");
           int n = sc.nextInt();
           
           int d = a2-a1;
           int t = a1+(n-1)*d;
           System.out.println("The "+ n+"th number is "+t);
	}

}
