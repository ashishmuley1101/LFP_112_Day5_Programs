package com.bridgelab.quotientremainder;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value for Divident : ");
		int divident = sc.nextInt();
		System.out.print("Enter the value for Divisor : ");
		int divisor = sc.nextInt();

		double quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println("Quotient for your given valve : " + quotient);
		System.out.println("Reaminder for your given valve : " + remainder);

		sc.close();
		
	}

}
