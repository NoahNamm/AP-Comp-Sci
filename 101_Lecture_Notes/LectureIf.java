/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("You've joined an Alien Echange program");
    System.out.println("Pick an Alien to take in!");
    System.out.println("1. Joe, a fat bellied alien wh oloves eating.");
    System.out.println("2. Bob, a blue alien who loves trees.");
    System.out.println("3. Barney, a purple tailed alien who eats butterflies.");
    System.out.println("Enter the number of the Alien you would like to select");
    
    int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You picked Joe!");
        }
        else if (answer1 == 2){
            System.out.println("You picked Bob!");
        }
        else if (answer1 == 3);
         System.out.println("You picked Barney!");
        else{
            System.out.println("You have picked Mr. Poole, a secret agent hittin behind his mask who speaks through a computer.");
        }
        
        
	}
}