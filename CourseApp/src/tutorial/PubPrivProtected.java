package tutorial;

// private -- only within same class
// public -- from anywhere
// protected -- same class, subclass, same package
// no modifier -- same class and same package only


// only one public class in the file, identical to class filename; multiple no modifier classes possible

public class PubPrivProtected {
public static void main(String[] args) {
	Plant plant = new Plant();
	// you can access public method anywhere which is bad practice usually
	System.out.println(plant.name);
	System.out.println(plant.ID);
	// type won't work - private
	//System.out.println(plant.type);
}
}
