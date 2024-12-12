/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is your birthday month?");
		String bdayMonth = sc.nextLine();
		
		System.out.println("What day were you born in "+bdayMonth);
		String bdayDay = sc.nextLine();
		
		System.out.println("What year were you born in?");
		String bdayYear = sc.nextLine();
		
		System.out.println("How much is a buck fifty?");
		String buckFifty = sc.nextLine();
		
		System.out.println("Your name is "+name+". You are "+age+" years old. You were born on "+bdayMonth+" "+bdayDay+" "+bdayYear);
		System.out.println("you also said a buck fifty is worth "+buckFifty+" dollars.");
	}
}
