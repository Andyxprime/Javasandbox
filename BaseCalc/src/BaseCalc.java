import java.util.Scanner;

public class BaseCalc {
	
public static void main(String[] args) {
	
	System.out.println("Greetings! BaseCalc is launched.");
	
	Scanner command = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	String text;
	double A;
	double B;
	
	do {
	System.out.println("\nPlease enter the command to start('help' for list of commands):");
	text = command.nextLine();
	
	switch (text) {
	case "help":
		System.out.println("'help' - list of commands\n"
				+ "'add' or '+' - start add operation\n"
				+ "'sub' or '-' - start substract operation\n"
				+ "'mult' or '*' - start multiply operation\n"
				+ "'div' or '/' - start divide operation\n"
				+ "'exit' or 'X' - exit the app");
		break;
	
	case "add":
	case "+":
	System.out.println("Enter first variable:");
	A = input.nextInt();
	System.out.println("Enter second variable:");
	B = input.nextInt();
	System.out.println("The result is: " + (A + B));
	break;
	
	case "sub":
	case "-":
		System.out.println("Enter first variable:");
		A = input.nextInt();
		System.out.println("Enter second variable:");
		B = input.nextInt();
		System.out.println("The result is: " + (A - B));
		break;
		
	case "mult":
	case "*":
		System.out.println("Enter first variable:");
		A = input.nextInt();
		System.out.println("Enter second variable:");
		B = input.nextInt();
		System.out.println("The result is: " + (A * B));
		break;
		
	case "div":
	case "/":
		System.out.println("Enter first variable:");
		A = input.nextInt();
		System.out.println("Enter second variable:");
		B = input.nextInt();
		if(B==0) {
			System.out.println("Dividing by zero is forbidden. Enter a valid variable.\n"
					+ "Enter second variable:");
			B = input.nextInt();
		}
		System.out.println("The result is: " + (A / B));
		break;
		
	case "exit":
	case "X":	
		System.out.println("Exiting now...");
		System.exit(0);
		
		default:
			System.out.println("Command not recognized. Please enter another command or type 'help' for list of commands.");
	}
}
	while(text != "exit"); 
		command.close();
		input.close();
}
}
