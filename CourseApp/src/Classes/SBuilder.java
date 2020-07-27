package classes;

public class SBuilder {
	
public static void main(String[] args) {
	
	
	// inefficient and resource-depleting
	String info = "";
	info += "My name is Andy.";
	info += " ";
	info += "I am a QA engineer.";
	
	System.out.println(info );
	
	// string builder is more efficient
	StringBuilder sb = new StringBuilder("");
	
	sb.append("My name is Andrei.");
	sb.append(" ");
	sb.append("I was a front office manager before.");
	
	System.out.println(sb.toString());
	
	
	// alternative way
	StringBuilder s = new StringBuilder();
	
	s.append("My name is Andrey.").append(" ").append("And I was a tech specialist even before that.");
	
	System.out.println(s.toString());
	
	// Formatting //
	
	System.out.print("Here is some text.\t That was a tab.\nThat was a new line.");
	System.out.println(" More text.");
	
	// Formatting integers
	System.out.printf("Total cost %-10d; quantity is %d\n", 5, 121);
	
	for (int i=0; i<20; i++) {
		System.out.printf("%2d: %s\n", i, "Some more text.");
	}
	
	// Formatting floating point values
	System.out.printf("Total value: %.2f\n", 7.995);
	System.out.printf("Total value: %-7.1f\n", 925.387653);
}
}
