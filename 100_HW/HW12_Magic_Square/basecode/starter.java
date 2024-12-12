import pkg.*;
import java.util.*;
class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many special squares you want to see:");
		int n = sc.nextInt();
		CVMath.specialSquareGenerator(n);
		
	}
}
