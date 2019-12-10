
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
       //ask the user's age
	System.out.println("How old are you?");
	Scanner reader = new Scanner (System.in);
	//compare the user's age with the age of majority
	if (reader.nextInt() >=18 ) {
		System.out.println("You have reached the age of majority!");
	}
	else {
		System.out.println("You have not reached the age of majority!");
	}	
    }
}
