/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What day of the week is it?");
	System.out.println("Please enter the corresponding integer, 0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday.");
	
	int day = sc.nextInt();
	
	if (day>=1 && day <=5){
		System.out.println("Wake up at 7:00am!");
	}
	else if (day==0 || day==6){
		System.out.println("Wake up at 10:00am!");
	}
	else 
	System.out.println("That is not a day of the week");
	}
}
