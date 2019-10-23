import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
         endPartCharacters(); 
    }
   
    public static void endPartCharacters(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the last part:");
        int characters = reader.nextInt();
        int end = word.length();
        System.out.println("Result: "+word.substring(end-characters,end) );
        /*while(characters > count){
            System.out.print(name.charAt(count));
            count++;
        }*/
    }
}
