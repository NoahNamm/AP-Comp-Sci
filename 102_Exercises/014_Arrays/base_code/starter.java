/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int [1001];
		 int c1 = 0;
		 int num1 = 3;
		 while (c1<arr1.length){
		 	arr1[c1] = num1;
		 	System.out.print(arr1[c1]+", ");
		 	c1++;
		 	num1 = num1+3;
		 }
		 System.out.println("------------------------------------------------------------------------------------------------------");
		 int [] arr2 = new int [1001];
		 int c2 = 0;
		 int num2 = 1000;
		 while (c2<arr2.length){
		 	arr2[c2] = num2;
		 	System.out.print(arr2[c2]+", ");
		 	c2++;
		 	num2--;
		 }
	}
}
