package tutorial;

// importing classes from another package
import classes.Car;
import classes.MachineN;
import classes.subclasses.Testclass;

// importing all classes from package
/*import classes.*;*/

public class Template {
public static void main(String[] args) {
	Car honda = new Car();
	
	honda.start();
	honda.wipeWindShield();
	honda.stop();
	
	MachineN ibm = new MachineN();
	
	ibm.start();
	ibm.stop();
	
	Testclass newtest = new Testclass();
	newtest.list();
}
}
