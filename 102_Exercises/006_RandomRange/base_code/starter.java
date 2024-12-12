/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter 2 nmbers to create a range for your random number");
	
	System.out.println("Please enter an integer");
	
	int number1 = sc.nextInt();
	
	System.out.println("Please enter another integer (Bigger than the first)");
	
	int number2 = sc.nextInt();
	
	System.out.println("Your range is "+number1+" to "+ number2);
	
	System.out.println("Here are 5 nubmers generated in that range.");
	int range = (number2 - number1);
	
	System.out.print((int)(Math.random()*range)+number1+", ");
	System.out.print((int)(Math.random()*range)+number1+", ");
	System.out.print((int)(Math.random()*range)+number1+", ");
	System.out.print((int)(Math.random()*range)+number1+", ");
	System.out.print((int)(Math.random()*range)+number1);

	}
}
