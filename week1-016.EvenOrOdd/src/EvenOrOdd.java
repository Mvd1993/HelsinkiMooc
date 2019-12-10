
import java.util.Scanner;

public class EvenOrOdd {
//Create a program that asks the user for a number and tells whether the number is even or odd.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ask for a number
	System.out.println("type a number:");
	int number = reader.nextInt();
	if (number % 2 == 0) {
		System.out.println("Number " + number + " is even.");
	}
	else {
            System.out.println("Number " + number + " is odd.");}
	}

    }

