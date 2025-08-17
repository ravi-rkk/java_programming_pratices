package Easy_Programmign_question;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the side of traingle");
     int s1 = sc.nextInt();
     int s2 = sc.nextInt();
     int s3 = sc.nextInt();
     
     if((s1+s2 > s3) ) {
    	 System.out.println("valid");
     }
     else {
    	 System.out.println("Not valid");
     }
	}

}
