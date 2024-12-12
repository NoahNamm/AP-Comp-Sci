/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+"!");
        
        System.out.println("please enter an integer");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("please enter another integer");
        int number2 = sc.nextInt();
        sc.nextLine();
        
        int sum = number1+number2;
        
        System.out.println(number1+"+"+number2+"="+sum);
        
        System.out.println("What is your favorite food?");
        
        String food = sc.nextLine();
	}
}