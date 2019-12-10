//In this exercise we create a program that asks the user for a password. 
//If the password is right, a secret message is shown to the user.
import java.util.Scanner;
 
public class Password {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; 
        
        while (true) {
             //ask password
            System.out.print("Type the password: ");
            String readPassword = reader.nextLine();
            //check if the password is correct
            if (readPassword.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        
        System.out.println(""); 
        System.out.println("The secret is: jryy qbar!");
    }
}
 