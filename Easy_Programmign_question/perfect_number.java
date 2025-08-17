package Easy_Programmign_question;

import java.util.Iterator;
import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int a = sc.nextInt();
		int n =0;
		for (int i = 1 ; i<a; i++) {
			if(a%i == 0) {
				n = n+i;
				
				}
			
		}
		if(n==a) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		

	}

}
