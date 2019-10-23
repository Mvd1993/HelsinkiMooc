
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        printTwiced();
    }
    //create the reader
    public static Scanner reader(){
        Scanner reader = new Scanner(System.in);
        return reader;
    }
    //ask names until a named is twiced in the array
    public static String twicedWord(){
        ArrayList<String> words = new ArrayList<String>();
        
        Scanner reader = reader();
        while(true){
            System.out.println("type a word: ");
            String word=reader.nextLine();
            if (words.contains(word)){
                return word;
            }
            words.add(word);
        }
        
    }
    //print the twiced word
    public static void printTwiced(){
        System.out.println("you gaved the word " + twicedWord() + " twice");
    }
}
