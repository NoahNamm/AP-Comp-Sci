/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior [] Warrior = new Warrior [100];
		Wizard [] Wizard = new Wizard [100];
			for (int i = 0; i <100; i++){
				Warrior[i] = new Warrior();
				Wizard [i] = new Wizard();
			}
		int warNum = 0;
		int wizNum = 0;
		while (warNum < Warrior.length-1 && wizNum < Wizard.length-1){
			Wizard[wizNum].attack(Warrior[warNum]);
			if (Warrior[warNum].isDead()){
			warNum++;
			}
			Warrior[warNum].attack(Wizard[wizNum]);
			if (Wizard[wizNum].isDead()){
			wizNum++;
			}
		}
		if (warNum<99){
		System.out.println("Warriors won with "+(100-(warNum+1))+" left in their army.");
		}
		if (wizNum<99){
		System.out.println("Warriors won with "+(100-(wizNum+1))+" left in their army.");
		}
	}
}
