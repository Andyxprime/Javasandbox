package tutorial2;

class Machine {
	public void start() {
		System.out.println("Machine has started.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera launched.");
	}
	
	public void snap() {
		System.out.println("Snapshot taken.");
	}
}
public class Upcastdowncast {
public static void main(String[] args) {
	
	Machine machine1 = new Machine();
	Camera camera1 = new Camera();
	
	machine1.start();
	camera1.start();
	camera1.snap();
	
	// upcasting - from child class Camera to Machine;
	Machine machine2 = camera1;
	machine2.start();
	// error machine2.snap();
	
	// downcasting - from parent class to child class
	// cannot downcast from unrelated classes
	Machine machine3 = new Camera();
	Camera camera2 = (Camera)machine3;
	camera2.snap();
	
	// Cannot turn machine object into camera object - runtime error
	/*Machine machine4 = new Machine();
	Camera camera3 = (Camera)machine4;
	camera3.start();*/
	
	
}
}
