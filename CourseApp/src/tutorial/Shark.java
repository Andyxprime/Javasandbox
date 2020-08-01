package tutorial;

public class Shark extends Fish {

	@Override
	public void evolve() {
		System.out.println("Shark is evolving.");
	}
	public void reproduce() {
		System.out.println("Shark is actively reproducing.");
	}
}
