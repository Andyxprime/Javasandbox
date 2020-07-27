package classes;

class Employee {
	String name;
	int age;
	
	void speak() {
		System.out.println("Name is: " + name);
	}
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		//System.out.println("Years left to retirement: "  + yearsLeft);
		
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
}

public class GettersReturns {

	public static void main(String[] args) {
	 Employee employee1 = new Employee();
	 
	 employee1.name = "Alex";
	 employee1.age = 25;
	 
	 employee1.speak();
	 //employee1.calculateYearsToRetirement();
	 
	 int years = employee1.calculateYearsToRetirement();
	 
	 System.out.println("Years till retirement: " + years);
	 int age = employee1.getAge();
	 System.out.println("Age is: " + age);
}
}
