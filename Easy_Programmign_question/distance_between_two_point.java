package Easy_Programmign_question;

import java.util.Scanner;

public class distance_between_two_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("ENter the corrdinates");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the second corrdinates");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int X = (x2-x1)*(x2-x1);
		int Y = (y2-y1)*(y2-y1);
		 
		int d = X+Y;
		double D = Math.sqrt(d);
		
		System.out.println("The distance is :-"+D);
	}

}
