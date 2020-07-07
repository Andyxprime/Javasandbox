
public class IfTest {
public static void main(String[] args) {
	/*int aInt = 31;
	if(aInt < 30) {
		System.out.println("I swear it's true!");
	}
	else if(aInt > 32) {
		System.out.println("Damn, that's a lie!");
	}
	else {
		System.out.println("None of the above");
	}*/
	int loop = 0;
	
	while(loop < 7) {
		System.out.println("Loop running: " + loop);
		if(loop==6) {
			break;
		}
		loop++;
		
		System.out.println("Ending run.");
	}
}
}
