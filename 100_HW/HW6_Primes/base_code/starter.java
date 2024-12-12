/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int checkNum){
			boolean prime = true;
			int divisor = 2;
			while (divisor<checkNum){
				if (checkNum%divisor==0){
				prime = false;
				break;
				}
			divisor++;
			}
		return prime;
	}
	public static void printPrimes(int num){
		int checkNum = 2; 
		while (checkNum<=num){
		if (checkPrime(checkNum) == true){
		System.out.println(checkNum);
		}
		checkNum ++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and we'll print out all the prime numbers until that number.");
		int num = sc.nextInt();
		printPrimes(num);
	}
}
