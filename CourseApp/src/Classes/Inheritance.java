package classes;

public class Inheritance {
	public static void main(String[] args) {
		MachineN mac1 = new MachineN();

		mac1.start();
		mac1.stop();

		// Car class inherits from MachineN class its methods
		Car car1 = new Car();
		car1.start();
		car1.showType();
		car1.wipeWindShield();
		car1.stop();
	}
}
