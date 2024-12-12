/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: \n 1. Each player starts with $10 \n 2. Input a wager less than your total amount of money.\n 3. The slot machine will roll 3 numbers from 1 to 10.\n a. If two numbers match, you double your money.\n b. If three numbers match, you triple your money. \n c. If none match, you lose your money \n --------------------------------------------------");
		int money = 100;
		int bet = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String answer;
		while (true){
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			answer = sc.nextLine();
			while (true){
			if (answer.equals("Yes")||answer.equals("yes")||answer.equals("Y")||answer.equals("y")){
				break;
			}
			else 
			System.out.println("YOU MUST PLAY. Answer again.");
				answer = sc.nextLine();
			}
				System.out.println("You have $"+money+" How much would you like to bet?");
				bet = sc.nextInt();
				sc.nextLine();
			while (bet > money){
				System.out.println("You only have $"+money+"! Please enter a smaller number!");
				bet = sc.nextInt();
				sc.nextLine();
			}
			while (bet <= 0){
				System.out.println("You cannot bet nothing or a negative number! Please enter your bet.");
				bet = sc.nextInt();
				sc.nextLine();
			}
			System.out.println("All bets are in, time to play!");
			num1 = (int)(Math.random()*10)+1;
			num2 = (int)(Math.random()*10)+1;
			num3 = (int)(Math.random()*10)+1;
			
			System.out.println("Your rolls are:\n____________\n  |"+num1+"|"+num2+"|"+num3+"|\n____________");
			if (num1==num2&&num2==num3){
				System.out.println("JACKPOT! All three numbers are the same. Your money has been tripled.");
				money = money *3;
				}
			if (num1 == num2 || num1 == num3 || num2 == num3){
				System.out.println("YOU WON! Your money has been doubled.");
				money = money*2;
			}
			else {
				System.out.println("You did not win this time.");
				money = money-bet;
			}
			System.out.println("You now have $"+money+"\n-------------------");
			if (money==0){
				System.out.println("You have run out of money! Thank you for playing! Hope to see you again soon");
				break;
			}
		}
	}
}
