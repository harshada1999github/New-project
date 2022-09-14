package com.velocity.java;
/*Write java program to check whether number is Armstrong or not.

 * (A positive number is called armstrong number if it is equal to the sum of cubes of its digits
 *  for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.
 *
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153)*/

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Armstrong {
	
	public static void main(String[]args) {
		int Num = 407, originalNum, remainder, result=0;
		
		originalNum = Num;
		
		while(originalNum != 0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, 3);
			originalNum/=10;
		}
		if(result == Num)
			System.out.println(Num + "is Armstrong num");
		else
			System.out.println(Num + "is not Armstrong num");
		
	}

}
