import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        vista();
    }
    public static void vista(){
        System.out.println("Type your name");
        FirstCharacters();
        
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
    public static void FirstCharacters(){
        String name = readName();
        int characters = calculateCharacters(name);
        if (characters >=3){
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }
    }
}
