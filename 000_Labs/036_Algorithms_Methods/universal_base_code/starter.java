/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;


class starter {
	public static void toStringArray(int[] arr){
		for (int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static int getArrayAverage(int[] arr){
		int sum = 0;
		for (int i = 0; i<arr.length; i++){
			sum = sum+arr[i];
		}
		return sum/arr.length;
	}
	public static int getArrayMax(int[] arr){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<arr.length; i++){
			if (arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] arr){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i<arr.length; i++){
			if (arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		int [] arr = new int [100];
		for (int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*99)+1;
		
		}
		toStringArray(arr);
		System.out.println("The array average is "+getArrayAverage(arr));
		System.out.println("The arrray max is "+getArrayMax(arr));
		System.out.println("The array min is "+getArrayMin(arr));
		System.out.println(arr);
		
	}
}
