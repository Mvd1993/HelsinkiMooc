
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
       int characters = calculateCharacters(text);
        String reversed = "";
        while(characters > 0){
            reversed = reversed + (text.charAt(characters-1));
            characters--;
        }
       return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
     //get the length of the name given
    public static int calculateCharacters(String name){ 
       return name.length();
    }
}
