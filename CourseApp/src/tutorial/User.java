package tutorial;

public class User implements InfoInt {
	private String name;
	
public User(String name) {
		this.name = name;
	}

public void greet() {
	System.out.println("Greetings!");
}

public void showInfo() {
System.out.println("User name is: " + name);	
}
}
