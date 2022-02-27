package com.bridgelab.vowelconsonant;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		System.out.print("Enter the Alphabet : ");

		Scanner sc = new Scanner(System.in);
		char inputChar = sc.next().charAt(0);

        char ch = 'z';

        switch (inputChar) {
            case 'a':
            	System.out.println(inputChar + " is vowel");
                break;
            case 'e':
            	System.out.println(inputChar + " is vowel");
                break;
            case 'i':
            	System.out.println(inputChar + " is vowel");
                break;
            case 'o':
            	System.out.println(inputChar + " is vowel");
                break;
            case 'u':
                System.out.println(inputChar + " is vowel");
                break;
            default:
                System.out.println(inputChar + " is consonant");
        }
    }
}
