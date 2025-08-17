package Baisc_Programming;

import java.util.Scanner;

public class Sum_of_natural_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Natural Number");
		Integer n = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i<=n;i++) {
			sum = i+sum;
		}
		System.out.println("Sum of " + n + " Natural Number is:-"+sum);

	}

}
