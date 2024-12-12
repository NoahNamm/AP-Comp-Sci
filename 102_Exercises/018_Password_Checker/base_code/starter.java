import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array 
		boolean lvl1;
		boolean lvl2;
		int level1 = 0;
		int level2 = 0;
		int level3 = 0;
		String pass = new String();
        for (int c = 0; c<passwords.length; c++){
            pass = passwords[c];
            if (pass.length()>=8){
            lvl1 = true;
            }
            else
            lvl1 = false;
            if (pass.contains("!")||pass.contains("@")||pass.contains("#")||pass.contains("$")||pass.contains("%")||pass.contains("^")||pass.contains("&")||pass.contains("*")){
            lvl2 = true;
            }
            else lvl2 = false;
            
            if (lvl1 && lvl2){
                level3++;
            }
            else if (lvl1){
                level1++;
            }
            else if (lvl2){
                level2++;
            }
        }
        System.out.println("There are "+level1+" level 1 passwords");
        System.out.println("there are "+level2+" level 2 passwords");
        System.out.println("There are "+level3+" level 3 passwords");
		
	}
}
