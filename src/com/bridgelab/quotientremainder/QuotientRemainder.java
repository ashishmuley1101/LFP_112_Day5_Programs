package com.bridgelab.quotientremainder;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the value for Divident : ");
		int divident = sc1.nextInt();
		System.out.print("Enter the value for Divisor : ");
		int divisor = sc2.nextInt();
        
		double quotient =  divident / divisor ;
		int remainder  =  divident % divisor ;
		
		System.out.println("Quotient for your given valve : " + quotient);
		System.out.println("Reaminder for your given valve : " + remainder);
		
		sc1.close();
		sc2.close();
	}

}
