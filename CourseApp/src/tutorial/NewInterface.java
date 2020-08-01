package tutorial;

public class NewInterface {
public static void main(String[] args) {
	
	Machine mach1 = new Machine();
	mach1.start();
	
	User user1 = new User("Admin");
	user1.greet();
	
	// creating a variable that refers to new machine, only one method available for access
	InfoInt info1 = new Machine();
	info1.showInfo();
	
	// pointing to existing user as User implements InfoInt
	InfoInt info2 = user1;
	info2.showInfo();
	
	System.out.println("\n");
	
	outputInfo(mach1);
	outputInfo(user1);
}

// passing different objects to a method as long as they implement the same interface
private static void outputInfo(InfoInt info) {
	info.showInfo();
}
}
