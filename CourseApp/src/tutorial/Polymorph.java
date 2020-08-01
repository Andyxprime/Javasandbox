package tutorial;

public class Polymorph {
public static void main(String[] args) {
	Fish fish1 = new Fish();
	Shark shark1 = new Shark();
	
	Fish fish2 = shark1;
	
	// what matters is not the variable or type of variable; what matters is the actual type of the object containing the actual code.
	fish2.evolve();
	
	shark1.reproduce();
	
	Fish fish3;
		
	//fish2.reproduce();
	
	
	// anywhere a parent class is expected you can use the child class of that parent
	doEvolve(shark1);
}
public static void doEvolve(Fish fish1) {
	fish1.evolve();
}
}
