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
		int [] arr = new int [(int)(Math.random()*150)+51];
		for (int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i<arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i =0; i<arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		int sum=0;
		for (int i = 0; i<arr.length; i=i+2){
			sum = sum +arr[i];
		}
		System.out.println("Smallest number in array: "+min);
		System.out.println("Largest number in array: "+max);
		System.out.println("Average of the numbers in array: "+(double)sum/arr.length);
		System.out.println("Size of array: "+arr.length);
		
	}
}