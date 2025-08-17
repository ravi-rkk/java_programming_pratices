package Easy_Programmign_question;

import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        
        int n = sc.nextInt();
        int original_number =n;
        int sum = 0;
        while(n>0) {
        int d = n%10;
         sum= sum+d;
          n = n/10;
//         System.out.println("d is"+d);
        }
        System.out.println("Sum of the digit "+original_number+" is "+sum);

}
}
	
