
class Bird {
	public static final int ID = 1;
	private String name;
	
	public String getData() {
		String data = "Bird size is: " + calcSize();
		
		return data;
	}

	private int calcSize() {
		return 3;
	}
	
	// source - generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
public static void main(String[] args) {
	
}
}
