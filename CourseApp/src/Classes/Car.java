package classes;

// Car is now identical MachineN class and inherits its methods
public class Car extends MachineN {
	// manual overriding parent method with own method
	/*public void start() {
		System.out.println("Car started!");
	}*/
	
	

	public void wipeWindShield() {

		System.out.println("Windshield is wiped clean.");
	}

	// IDE overriding parent method with own method Source>Override implement methods
	// @Override checks actual overriding parent method
	@Override
	public void start() {
		System.out.println("Car started!");
	}
	public void showType() {
		System.out.println(type);
	}
}
