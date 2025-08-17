package Baisc_Programming;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Table number");
      Integer n = sc.nextInt();
     for(int i =1 ; i<11;i++) {
    	 System.out.println(n+ "X" +i+ "=" +n*i+"\n" );
     }
	}

}
