package Baisc_Programming;

import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dice number");
		int n = sc.nextInt();
		for(int i =0 ;i<=6;i++) {
			if(n+i==7) {
				System.out.println("numer is " +i);
			}
		}

	}

}
