package Easy_Programmign_question;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a =1;
		for(int i = 1; i<=n;i++) {
		 a = i*a;
		
		}
		System.out.println("Factorial is:-" +a);
	}

}
