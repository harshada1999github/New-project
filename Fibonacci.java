package com.velocity.java;
//Write a java program to display the Fibonacci series up to given number.
//(Fibonacci series mean next number is the sum of previous two numbers
	//	for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).

public class Fibonacci {

	public static void main(String[] args) {
		
		int p = 45, firstTerm = 0, secondTerm = 1;
		
	System.out.println("Fibonacci series upto"+p+":");
	 
	while(firstTerm<= p) {
		System.out.println(firstTerm + "");
		
		int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;
	}
		

	}

}
