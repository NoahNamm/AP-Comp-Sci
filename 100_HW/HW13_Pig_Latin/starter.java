/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentance");
		String sentance = sc.nextLine();
		
		String finalSentance = ("");
		String newWord = ("");
		while (true){
			if (sentance.indexOf(" ")==-1){
			sentance = toPigLatin(sentance);
			finalSentance = finalSentance+sentance;
			break;
			}
			int space = sentance.indexOf(" ");
			String word = sentance.substring(0, space);
			
			sentance = sentance.substring(space+1);
			word = toPigLatin(word);
			finalSentance = finalSentance + word + " ";
		}
		System.out.println(finalSentance);
	}
public static String toPigLatin(String word){
	String letter1 = (word.substring(0,1));
	String letter2 = (word.substring(1,2));
	if (!(isVowel(letter1))&&(isVowel(letter2))){
		word = word.substring(1)+"-"+word.substring(0,1)+"ay";
	}
	else if (isVowel(letter1)){
		word = word+"-way";
	}
	else{
		word = word+"-ay";
	}
	return word;
}
public static boolean isVowel(String letter){
	if ((letter.equals("A"))||(letter.equals("a"))||(letter.equals("E"))||(letter.equals("e"))||(letter.equals("I"))||(letter.equals("i"))||(letter.equals("O"))||(letter.equals("o"))||(letter.equals("U"))||(letter.equals("u"))){
		return true;
	}
	else{
	return false;
	}
}
}