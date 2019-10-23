import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        System.out.println("Type your name:");
        System.out.println("First character : " + firstCharacter(readName()));
    }
     public static String readName(){
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }
    public static char firstCharacter(String name){
        return name.charAt(0);
    }
}
