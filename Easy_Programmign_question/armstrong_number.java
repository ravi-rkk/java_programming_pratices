package Easy_Programmign_question;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number:-");
           int a = sc.nextInt();
           int original_number =0;
           String string_number = Integer.toString(a);
           int digit_count = string_number.length();
           System.out.println("Count " +digit_count);
           
           for(int i =0; i< string_number.length();i++) {
        	   System.out.println(string_number.charAt(i));
        	   
           }
           
	}

}
