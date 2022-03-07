package com.bridgelab.windchill;

import java.util.Scanner;

public class WindChill {

	public static void windChill(double f, double ws) {

		double w = 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
		System.out.println("National Weather Service defines the effective temperature : " + w);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit : ");
		double f = sc.nextDouble();

		System.out.println("Enter wind speed in miles per hour : ");
		double ws = sc.nextDouble();

		if (Math.abs(ws) > 50 || ws > 120 || ws < 3) {
			System.out.println("Enter correct input");
		} else {
			windChill(f, ws);
		}
	}
}
