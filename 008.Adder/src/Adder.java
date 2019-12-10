
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	System.out.print("Type a number");
	int A = reader.nextInt();
	System.out.print("Type another number:");
	int B = reader.nextInt();
	//els sumem i retornem per pantalla 
	System.out.print("Sum of the numbers:" + Math.addExact(A, B));
        
    }
}
