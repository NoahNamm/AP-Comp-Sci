/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(Math.max(13-6*11, 30%7*(-2)));
		System.out.println(Math.sqrt(3*8+31%7));
		System.out.println(Math.pow(37/3, 35%21));
		System.out.println(Math.max(Math.pow(2,14%3), Math.sqrt( 2*6)));
		//java extra
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a double value for x");
		double x = sc.nextDouble();
		
		System.out.println("Input a double value for y");
		double y = sc.nextDouble();
		
		System.out.println("The Max of x and y is " + Math.max(x,y));
		System.out.println("The square root of y is "+Math.sqrt(y));
		System.out.println("x to the power of y is "+Math.pow(x,y));
		
	}
}
