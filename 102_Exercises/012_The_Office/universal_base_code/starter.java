/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(10);
		michael.employeeToString();
		Employee DwightSchrute = new Employee(1987, "Dwight", "Shrute", 4416.66);
		DwightSchrute.raiseSalary(15);
		DwightSchrute.employeeToString();
		Employee JimHalpert = new Employee(2474, "Jim", "Halpert", 4416.66);
		JimHalpert.raiseSalary(10);
		JimHalpert.employeeToString();
		Employee PamBeesly = new Employee(2011, "Pam", "Beesly", 2250);
		PamBeesly.raiseSalary(20);
		PamBeesly.employeeToString();
		Employee SamiSaamJack = new Employee(1234, "SamiSaam", "Jack", 3);
		SamiSaamJack.raiseSalary(23);
		SamiSaamJack.employeeToString();
	}
}
