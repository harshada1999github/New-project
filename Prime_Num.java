package com.velocity.java;
//Write Java program to check whether number is prime or not. 
//( Prime means  a number which is divisible by only two numbers: 1 and itself.
	//	So, if any number is divisible by any other number, it is not a prime number.)

public class Prime_Num {

	public static void main(String[] args) {
		// int num = 13;
		 int num =29;
		 boolean flag = false;
		 for (int i = 2; i <= num/2; ++i) {//condition from non prime number
			 
			 if (num% i == 0) {
				 flag =true;
				 break;
			 }
			 
		 }
		 if(!flag)
			 System.out.println(num +"is a prime number");
		 else
	     	 System.out.println(num +"is not a prime number'");
		

	}

}
