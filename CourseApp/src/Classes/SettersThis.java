package classes;

class Corporation {
	//inaccessible outside this class
	private String name;
	private int fdate;
	
	public void setName(String name) {
		//reference to the object
		this.name = name;
	}
	
	public void setFdate(int fdate) {
	this.fdate = fdate;
	}
	public String getName() {
		return name;
	}
	
	public int getFdate() {
		return fdate;
	}
}

public class SettersThis {
	public static void main(String[] args) {
		
		Corporation Corp1 = new Corporation();
		// instance variable with equal sign
		//Corp1.name = "IBM";
		//Corp1.fdate = 40;
		// calling a method
		Corp1.setName("IBM");
		Corp1.setFdate(1980);
		System.out.println(Corp1.getName());
		System.out.println(Corp1.getFdate());
		
	}

}
