package com.bridgelab.flipcoin;

import java.text.DecimalFormat;
import java.util.*;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("How many times you want to flip the coin ?");

		Scanner scan = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("##.00");

		int count = scan.nextInt();

		int headCount = 0;
		int tailCount = 0;

		for (int a = 0; a < count; a++) {
			if (Math.random() < 0.5) {

				headCount++;
			} else {

				tailCount++;

			}
		}

		scan.close();

		System.out.println("Total Head Count : " + headCount);
		System.out.println("Total Tail Count : " + tailCount);

		String headPercent = decimalFormat.format(((double) headCount / count) * 100);
		String tailPercent = decimalFormat.format(((double) tailCount / count) * 100);

		System.out.println("Head Percentage : " + headPercent + "%");
		System.out.println("Tail Percentage : " + tailPercent + "%");

	}

}
