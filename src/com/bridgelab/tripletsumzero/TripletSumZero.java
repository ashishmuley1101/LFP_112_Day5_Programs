package com.bridgelab.tripletsumzero;

public class TripletSumZero {
	public static void main(String[] args) {

		int array[] = { 1, 2, -3, 8, -5, 4 };

		for (int i = 0; i < array.length; i++) {
			int firstNumber = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int secoundNumber = array[j];
				for (int k = j + 1; k < array.length; k++) {
					int thirdNumber = array[k];

					int sum = firstNumber + secoundNumber + thirdNumber;
					if (sum == 0) {
						System.out.println(firstNumber + " " + secoundNumber + " " + thirdNumber);
					} 
				}
				System.out.println();

			}

		}
	}

}
