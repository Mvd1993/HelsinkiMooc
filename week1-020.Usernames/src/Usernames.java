
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username:");
        String nom = reader.nextLine();
        System.out.println("Type your pass:");
        String pass = reader.nextLine();
        if ((nom.equals("alex") && pass.equals("mightyducks"))||(nom.equals("emily") && pass.equals("cat")) ){
            System.out.println("You are now logged into the system!");
        }
        else{System.out.println("Your username or password was invalid!");}
    }
}
