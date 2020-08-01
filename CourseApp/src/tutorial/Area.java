package tutorial;

public class Area {
Plant plant = new Plant();

public Area() {
	// size is protected and Area is in the same package as Plant
System.out.println(plant.size);
}
}
