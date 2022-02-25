package com.bridgelab.hormonic;

	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class HarmonicNumber {

		public static void main(String[] args) {
			DecimalFormat decimalFormat = new DecimalFormat("##.00");
			
			System.out.print("Enter the Harmonic Number : ");

			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			double harmonicNumber = 0;
			if (number == 0) {
				System.out.println("Invalid input");
			} else {
				for (int i = 1; i <= number; i++) {
					harmonicNumber += (1.0 / i);
				}
				System.out.println("Harmonic number for " + number + " is : " + decimalFormat.format(harmonicNumber));
			}

			scan.close();
		}

	}
