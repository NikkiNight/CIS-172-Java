import java.util.*;
public class UserGuess {
	public static void main (String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a number between 1-10:");
        int number = myObj.nextInt();
		
		
		while (number != 0 && number != 3) {
			
			System.out.println("Enter a number between 1-10:");
			number = myObj.nextInt();
			
			if (number == 0) {
				System.out.println("Goodbye!");
				break;
			}			
			
			if (number == 3) {
				System.out.println("Congratulations!");
				break;
			}			
		}		
	}	
}