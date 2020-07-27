package classes;

class Thing {
	public final static int LUCKYNUMBER = 7;
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		
		count++;
	}
	
	public void showName() {
		 System.out.println(description + ":" + name);
		 //instance methods can access static data
	}
	
	public void showId() {
		System.out.println("Object ID is: " + id);
	}
	
	public static void showInfo() {
		System.out.println(description); /*reference to static method */
		// Won't work - reference to non-static variable System.out.println(name);
	}
	
}

public class StaticFinal {
public static void main(String[] args) {
	
	Thing.description = "This is a physical object";
	
	System.out.println(Thing.description);
	
	Thing.showInfo();
	
	System.out.println("Before creating object count is: " + Thing.count);
	
	Thing item1 = new Thing();
	Thing item2 = new Thing();
	
	item1.name = "Boot";
	item2.name = "Sock";
	
	//System.out.println(item1.name);
	//System.out.println(item2.name);
	item1.showId();
	item1.showName();
	item2.showId();
	item2.showName();
	
	System.out.println("After creating object count is: " + Thing.count);
	
	System.out.println(Math.PI);
	
	System.out.println(Thing.LUCKYNUMBER);
}
}
