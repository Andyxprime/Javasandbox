package classes;

class Robot {
	// declaring parameters and their types in method
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void throttle(int speed) {
		System.out.println("Throttling: " + speed);
	}
	public void relocate(String location, double distance ) {
		System.out.println("Projecting distance of " + distance + " km to " + location);
	}
}

public class MethodPars {
	public static void main(String[] args) {
		Robot T800 = new Robot();
		// method output for parameter
		T800.speak("I need your bike.");
		T800.throttle(10);
		// multiple parameters. separated by commas
		T800.relocate("San Diego", 250);
		
		Robot R2D2 = new Robot();
		R2D2.speak("Beep-boop!");
		// mentioning another string name as a label for method output
		String confused = "Beepwoopdoopbam!";
		R2D2.speak(confused);
	}

}
