import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int read = Integer.parseInt(reader.nextLine());
        int total = 1;
        while (read > 0){
            total = total * read;
            read -= 1;
        }
        System.out.println("Factorial is "+total);
    }
}
