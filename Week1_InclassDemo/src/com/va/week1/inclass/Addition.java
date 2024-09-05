package com.va.week1.inclass;

import java.util.Scanner;

/** 
 * @author vivek_

 * @since 2024-09-05
 * @implNote Class does addition of two nos.. 
 * 
 */

public class Addition {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int number;
		int number2;
		int sum;
		
		System.out.println("Enter first no"); 
		number = sc.nextInt();   //scanning integer input
		
		System.out.println("Enter second no"); 
		number2 = sc.nextInt();
		
		sum = number + number2;
		System.out.println("Sum is : " +sum); 
		
		sc.close();  // closing scanner object
		
		

	}

}
