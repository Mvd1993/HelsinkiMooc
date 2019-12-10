//Create a program that asks for the user's age and checks that it is reasonable 
//(at least 0 and at most 120).
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        //Ask and check for the age
        if ( number <= 120 && number >= 0){
        
            System.out.println("OK");
        }
        else{
             System.out.println("Imposible!");
        }

    }
}
