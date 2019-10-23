
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        vista();
    }
    public static void vista(){
        System.out.println("Type your name");
        SeparateCharacters();
        
    }
    //read your name
    public static String readName(){
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }
    //get the length of the name given
    public static int calculateCharacters(String name){ 
       return name.length();
    }
    public static void SeparateCharacters(){
        String name = readName();
        int characters = calculateCharacters(name);
        int count = 1;
        while(count <= characters){
            System.out.println(count +". character: " + name.charAt(count-1));
            count++;
        }
    }
}
