/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();
    
    greeting("Saam");
    greeting("Jack");
    greeting("Sami");
    greeting("Brian");
    
    double newSalary = raise(200000.42, 5);
    System.out.println(newSalary);
    newSalary = raise(newSalary, 5);
    System.out.println(newSalary);
    newSalary = raise(newSalary, 5);
    System.out.println(newSalary);
	}
	
	public static double raise(double salary, double percent){
	    double raisedSalary = salary + (salary *(percent/100.0));
	    return raisedSalary;
}
	
	public static void greeting(String name){
	    System.out.println("안녕하세요 "+name);
	}
	
	public static void printAnimal(){
	    System.out.println("         { }");
	    System.out.println("         {^^,");
	    System.out.println("         (   `-;");
	    System.out.println("    _     `;;~~");
	    System.out.println("   /(______);");
	    System.out.println("  (         (");
	    System.out.println("   |:------( )");
	    System.out.println(" _//         \\\\");
	    System.out.println("/ /          vv");
	    return;
	}
	
}