package Easy_Programmign_question;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            int original_number = n;
            int reverse_number = 0;
            while(n>0) {
            	int digit = n%10;
             reverse_number = (reverse_number*10)+digit;
            	n = n/10;
            }
            System.out.println("Revers number is:-"+reverse_number);
	}

}
