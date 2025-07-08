import java.util.*;
public class CellPhoneService {
    public static void main (String args[]) {
        
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter talk minutes needed:");
        int talkMinutes = myObj.nextInt();

        System.out.println("Enter text messages needed:");
        int textMessages = myObj.nextInt();

        System.out.println("Enter gigabytes of data needed:");
        int gigabytesData = myObj.nextInt();

        
        if (talkMinutes < 500 && textMessages == 0 && gigabytesData == 0) {
            System.out.println("Suggested plan: Plan A at 49$ a month.");
        } else if (talkMinutes < 500 && textMessages != 0) {
            System.out.println("Suggested plan: Plan B at 55$ a month.");
        } else if (talkMinutes >= 500 && gigabytesData == 0) {
            if (textMessages < 100) {
                System.out.println("Suggested plans: Plan C at 61$ a month.");
            } else {
                System.out.println("Suggested plans: Plan D at 70$ a month.");
            }        
        } else if (gigabytesData <= 3) {
            System.out.println("Suggested plans: Plan E at 79$ a month.");
        } else {
            System.out.println("Suggested plans: Plan F at 87$ a month.");
        } 
                
    }
}
