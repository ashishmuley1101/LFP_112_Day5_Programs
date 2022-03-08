package com.bridgelab.quadratic;

import java.util.Scanner;

public class Quadratic {

	static void roots(int a, int b, int c) {
		
		double delta = (b * b - 4 * a * c);
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("Root of x1 : " +x1);
		System.out.println("Root of x2 : " +x2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter a ");
			int a = sc.nextInt();
			System.out.println("enter b");
			int b = sc.nextInt();
			System.out.println("enter c");
			int c = sc.nextInt();
			roots(a, b, c);
		
		sc.close();
	}

}
