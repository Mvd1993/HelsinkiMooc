import java.util.Scanner;


public class LastCharacter {
    public static void main(String[] args) {
       vista();
    }
    //ask for your name and print the result
    public static void vista(){
        System.out.println("Type your name:");
        System.out.println("Last character : " + lastCharacter(readName()));
    }
    //read your name
    public static String readName(){
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }
    //get the last character of the name given
    public static char lastCharacter(String name){
        return name.charAt(calculateCharacters(name) - 1);
    }
    //get the length of the name given
    public static int calculateCharacters(String name){ 
       return name.length();
    }
}
