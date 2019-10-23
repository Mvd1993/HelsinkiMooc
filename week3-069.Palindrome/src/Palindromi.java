import java.util.Scanner;

public class Palindromi {

    //get the length of the name given
    public static int calculateCharacters(String name){ 
       return name.length();
    }
    
    public static String ReverseCharacters(String name){
        
        int characters = calculateCharacters(name);
        String reversed = "";
        while(characters > 0){
            reversed = reversed + (name.charAt(characters-1));
            characters--;
        }
       return reversed;
        
    }
    public static boolean palindrome(String text) {
        // write code here
        String reversed = ReverseCharacters(text);
        
        if (text.equals(reversed)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}



   
    
    
    
    