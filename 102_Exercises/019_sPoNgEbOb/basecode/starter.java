/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input a sentance");
	String sentance = sc.nextLine();
	
	while (true){
		if (sentance.indexOf(" ") == -1){
			System.out.print(spongeCase(sentance));
			break;
		}
		int space = sentance.indexOf(" ");
		String word = sentance.substring(0, space);
		System.out.print(spongeCase(word)+" ");
		sentance = sentance.substring(space+1);
	}
}
	public static String spongeCase(String word){
		String letter = new String();
		String finalWord = new String();
	for (int i = 0; i<word.length(); i++){
		letter = word.substring(i,i+1);
		if (i %2 != 0){
			letter = letter.toUpperCase();
		}
		if (i %2 == 0){
			letter = letter.toLowerCase();
		}
		finalWord = finalWord+letter;
	}
	return finalWord;
	}
}