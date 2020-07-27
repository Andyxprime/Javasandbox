package classes;

class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor running");
		
		name = "Bernie";
	}
	
	public Machine(String name) {
		System.out.println("Second constructor running.");
		this.name = name;
	}
	
	public Machine(String name, int code ) {
		System.out.println("Third constructor initiated");
		this.name = name;
		this.code = code;
	}
}

public class Constructors {
public static void main(String[] args) {
	Machine machine1 = new Machine();
	
	Machine machine2 = new Machine ("Andy");
	
	Machine machine3 = new Machine ("Chalky", 77);
}
}
