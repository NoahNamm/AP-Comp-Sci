/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int [10];
		int i = 0;
		int num = 9;
		while (i<arr.length){
			arr[i] = num;
			System.out.println(arr[i]);
			i++;
			num--;
		}

		
	}
}
