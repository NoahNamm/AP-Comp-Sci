/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number");
	int number = sc.nextInt();
	
	System.out.println("Here are the next 5 numbers");
	System.out.println((number + 1) +","+ (number + 2)+","+(number + 3)+","+(number + 4)+","+(number + 5));
	
	System.out.println("Here are the next 5 multiples of "+number+"!");
	System.out.println((number*2)+","+(number*3)+","+(number*4)+","+(number*5)+","+(number*6));
	
	double number2 = number;
	
	System.out.println(number+" Divided by 100 = "+ (double)(number2/100));
	
	}
}
