package tutorial;

public class Plant {
	// declaring a public instanced variable is bad practice as it can be accessed anywhere
	public String name;
	
	// acceptable practice - it's final and it cannot be changed
	public final static int ID = 001;
	
	
	// private variable can be accessed only in current class boundaries
	private String type;
	
	protected String size;
	
	// package level accessibility
	int height;
	
	public Plant() {
		this.name = "Cactus";
		
		this.type = "Green";
		
		this.size = "Small";
		
		this.height = 3;
	}
}
