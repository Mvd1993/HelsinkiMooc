
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
         firstPartCharacters(); 
    }
   
    public static void firstPartCharacters(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part:");
        int characters = reader.nextInt();
        
        System.out.println("Result: "+word.substring(0,characters) );
        /*while(characters > count){
            System.out.print(name.charAt(count));
            count++;
        }*/
    }
 
}

    
   
   
    
       
        
   