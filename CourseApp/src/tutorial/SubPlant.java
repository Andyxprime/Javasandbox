package tutorial;

public class SubPlant extends Plant {

	public SubPlant() {
		// Won't work -- type is private
		//type = "tree";
		
		
		// works as size is protected, SubPlant is subclass of plant
		//and it's within the same package
		this.size = "Large";
	}
}
