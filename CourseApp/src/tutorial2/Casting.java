package tutorial2;

public class Casting {
public static void main(String[] args) {
	int intValue = 888;
	short shortValue = 77;
	byte byteValue = 20;
	long longValue = 25667;
	float floatValue = 1711.8f;
	float floatV2 = (float)99.3;
	double doubleValue = 82.4;
	
	System.out.println("Short max value is: " + Short.MAX_VALUE);
	System.out.println("Byte max value is: " + Byte.MAX_VALUE);
	System.out.println("Long max value is: " + Long.MAX_VALUE);
	System.out.println("Float max value is: " + Float.MAX_VALUE);
	System.out.println("Double max value is: " + Double.MAX_VALUE);
	
	// casting long into int
	intValue = (int) longValue;
	System.out.println(intValue);
	
	// no casting required as the value remains the same technically, java does it automatically
	doubleValue = intValue;
	System.out.println(doubleValue);
	
	//casting float into int
	intValue = (int)floatValue;
	System.out.println(intValue);
	
	// overlapping the maximum value makes it take a full circle 
	// and start again from minimum value (-128)
	byteValue = (byte)128;
	System.out.println(byteValue);
}
}
