package tutorial2;

import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
public static void main(String[] args) {
	
	// Before Java 5
	ArrayList list = new ArrayList();
	
	list.add("apple");
	list.add("banana");
	list.add("orange");
	
	String fruit = (String)list.get(1);
	
	System.out.println(fruit);
	
	// modern solution - specifying the generic type
	ArrayList<String> strings = new ArrayList<String>();
	
	strings.add("cat");
	strings.add("dog");
	strings.add("parrot");
	
	String animal = strings.get(2);
	System.out.println(animal);
	
	// There can be more than one type argument
	
	HashMap<Integer, String> map = new HashMap<>();
		
}
}
