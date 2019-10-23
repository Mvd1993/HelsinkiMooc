
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 1;
        System.out.println("Guess a number: ");
        int guessedNumber = reader.nextInt();
        while (numberDrawn != guessedNumber){
           
            if (guessedNumber > numberDrawn){
                System.out.println("The number is lesser, guesses made: "+guess );
            }
            else{System.out.println("The number is greater, guesses made: "+guess);}
            System.out.println("Guess a number: ");
            guessedNumber = reader.nextInt();
            guess+=1;
        }
        System.out.println("Congratulations, your guess is correct!, guesses made: "+guess);
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
