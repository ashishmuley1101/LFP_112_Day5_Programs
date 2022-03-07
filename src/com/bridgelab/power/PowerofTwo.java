package com.bridgelab.power;

import java.util.Scanner;

public class PowerofTwo {
	public static void main(String[] args) {
		final int BASE_VALUE = 2;
		int exponentValue;

		System.out.println("Enter the exponent value :  ");
		Scanner sc = new Scanner(System.in);
		exponentValue = sc.nextInt();

		if (exponentValue >= 0 && exponentValue < 31) {
			int result = (int) Math.pow(BASE_VALUE, exponentValue);
			System.out.println("Power 2 for exponent " + exponentValue + " is : " + result);
		} else {
			System.out.println("Enter Exponent value in between 0 to 30");
		}
	}
}
