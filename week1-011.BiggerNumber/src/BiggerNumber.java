
import java.util.Scanner;

public class BiggerNumber {
//Create a program that asks the user for two integers and then prints the larger of the two	
	public static void main(String[] args) {
	//llegim els numeros d'entrada
	Scanner reader = new Scanner(System.in);
	System.out.print("Type a number");
	int A = reader.nextInt();
	System.out.print("Type another number:");
	int B = reader.nextInt();
	//els comparem i retornem per pantalla el mes gran
	System.out.print("The bigger number of the two numbers given was:" + Math.max(A, B));
    }
}
