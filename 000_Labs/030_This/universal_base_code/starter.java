/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int duplicates = 0;
		
		PooleDwarf test = new PooleDwarf();
		PooleDwarf p1 = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf p2 = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf p3 = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf p4 = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf p5 = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf p6 = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf p7 = new PooleDwarf(randName(), (int)(Math.random()*10));
		
		if (p1.isSameName(p2.getName())){
		duplicates ++;
		}
		
		if (p1.isSameName(p3.getName())){
		duplicates ++;
		}
		
		if (p1.isSameName(p3.getName())){
		duplicates ++;
		}
		
		if (p1.isSameName(p4.getName())){
		duplicates ++;
		}
		
		if (p1.isSameName(p5.getName())){
		duplicates ++;
		}
		
		if (p1.isSameName(p6.getName())){
		duplicates ++;
		}
		
		if (p1.isSameName(p7.getName())){
		duplicates ++;
		}
		
		if (duplicates > 0){
		System.out.println("There are "+ duplicates+" duplicates");
		System.out.println("The duplicate name was "+ p1.getName());
		}
		else
		System.out.println("There are no duplicates");
		
	}
}
