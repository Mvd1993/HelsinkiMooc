import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        vista();
    }
    public static void vista(){
        System.out.println("Type your name");
        ReverseCharacters(); 
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
    public static void ReverseCharacters(){
        String name = readName();
        int characters = calculateCharacters(name);
        while(characters > 0){
            System.out.print(name.charAt(characters-1));
            characters--;
        }
       
        
    }
}
