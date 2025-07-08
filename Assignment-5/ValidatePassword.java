import java.util.*;
public class ValidatePassword {
    public static void main(String[] args) {
  
        //Declaration for while loop
        boolean valid = false;
            
        while (valid == false) {

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a password: ");
            String password = myObj.next();
            
            //Declarations            
            int uppercaseCount = 0;
            int lowercaseCount = 0;
            int digitCount = 0;

            for (int i = 0; i < password.length();) {

                char letter = password.charAt(i);

                if (Character.isDigit(letter)) {
                    digitCount++;
                } else if (Character.isUpperCase(letter)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(letter)) {
                    lowercaseCount++;
                }                                
                i++;                
            } //END FOR

            if (digitCount >= 1 && uppercaseCount >= 2 && lowercaseCount >= 3) {
                System.out.println("Valid password");
                break;
                } else {
                System.out.println("Invalid password:" );
                valid = false;
                }

                if (digitCount < 1) {
                    System.out.println("Not enough digits.");
                }

                if (uppercaseCount < 2) {
                    System.out.println("Not enough uppercase letters.");
                }

                if (lowercaseCount < 3) {
                    System.out.println("Not enough lowercase letters.");
                } //END IF
        } //END WHILE
    }
}
