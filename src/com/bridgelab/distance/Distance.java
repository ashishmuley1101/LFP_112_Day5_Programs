package com.bridgelab.distance;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for point x");
		int x = sc.nextInt();
		System.out.println("enter value for point y ");
		int y = sc.nextInt();
		double dist1 = distance(x, y);

		DecimalFormat decimalFormat = new DecimalFormat("##.00");

		System.out.println("Distance for the origin is  : " + decimalFormat.format(dist1));

		sc.close();
	}

	public static double distance(int x, int y) {

		double dist = Math.sqrt((x * x + y * y));
		return dist;

	}

}