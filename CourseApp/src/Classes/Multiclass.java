package Classes;

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
	
}


public class Multiclass {
	public static void main(String[] args) {
		Company company1 = new Company();
		company1.companyname = "Veeam";
		company1.cmpposition = "Junior QA";
		
		Company company2 = new Company();
		company2.companyname = "DINS";
		company2.cmpposition = "QA Intern";
	}

}
