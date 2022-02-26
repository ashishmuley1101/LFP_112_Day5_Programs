package com.bridgelab.primefactors;

import java.util.Scanner;

public class PrimeFactors {
	  
	public static void main(String args[]){
		    
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Enter a number the Prime Number : ");
		      int number = sc.nextInt();
		     System.out.println("The Factors are : ");
		      for(int i = 2; i< number; i++) {
		         while(number%i == 0) {
		            System.out.print(i+" ");
		            number = number/i;
		         }
		      }
		      if(number >2) {
		         System.out.println( number);
		      }
		   }
		}