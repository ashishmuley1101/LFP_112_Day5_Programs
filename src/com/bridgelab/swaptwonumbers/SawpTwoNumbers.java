package com.bridgelab.swaptwonumbers;

import java.util.Scanner;

public class SawpTwoNumbers {

	 public static void main(String[] args) {  
	       int firstNum, SecoundNum, swapNum; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value for 1stNO and 2ndNo :");  
	       firstNum = sc.nextInt();  
	       SecoundNum = sc.nextInt();  
	       System.out.println("Before swapping Numbers are : "+firstNum +"  "+ SecoundNum);  
	      
	       swapNum = firstNum;  
	       firstNum = SecoundNum;  
	       SecoundNum = swapNum;  
	       System.out.println("After swapping Numbers are : "+firstNum +"   " + SecoundNum);  
	       System.out.println( );  
	       sc.close();
	    }    
	}