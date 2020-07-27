package classes;

class Company {
	// instance variables (data or state)
	String companyname;
	String cmpposition;
	int responsesent;
	int responsenotread;
	int responseread;
	int interview;
	int rejection;
	boolean intpassed;
	boolean joboffer;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void list() {
		System.out.println("Company is: " + companyname + "\nPosition is: " + cmpposition);
	}
	void sayHello() {
		System.out.println("Welcome!");
	}
}


public class Multiclass {
	public static void main(String[] args) {

		// Create a Company object using the Company class
		Company company1 = new Company();
		company1.companyname = "Macrosoft";
		company1.cmpposition = "Junior QA";
		company1.sayHello();
		company1.list();

		Company company2 = new Company();
		company2.companyname = "Casebook";
		company2.cmpposition = "QA Intern";
		company2.list();
	}

}
