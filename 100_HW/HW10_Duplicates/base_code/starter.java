/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		System.out.println("These are the 20 numbers \n");
		for (int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
		System.out.println("----------------------------------------------");
		int target = (int)(Math.random()*10)+1;
		System.out.println("The random number to look for is "+target);
		int numDupes = 0;
		for (int i = 0; i<arr.length; i++){
			if (arr[i] == target){
				System.out.println("Duplicate found at index " + i);
				numDupes++;
		}
	}
			System.out.println("The total number of duplcates for "+target+" is "+numDupes);
			System.out.println("----------------------------------------------");
			System.out.println("Looking for two in a row:");
			for (int i = 0; i < arr.length-1; i++){
				if (arr[i] == arr[i+1])
				System.out.println("Two in a row found at indexes "+ i+" and "+(i+1)+". The number is "+arr[i]);
			}

}
}
