package Easy_Programmign_question;

import java.util.Scanner;

public class palidrom_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:-");
		int number = sc.nextInt();
		int original_number = number;
		int reverse_number = 0;
		while(original_number>0) {
			int digit =  original_number%10;
			reverse_number =(reverse_number*10)+digit;
			original_number = original_number/10;
		  
    
	
	}
		if(number == reverse_number) {
			System.out.println("YES");
		}
		else {
		   System.out.println("NO");
}
}
}