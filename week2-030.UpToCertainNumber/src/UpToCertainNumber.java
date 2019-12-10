//Create a program that prints all whole numbers from 1 to the number the user enters.
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ask for the max number
        System.out.println("up to what number?");
        int max = reader.nextInt();
        //init counter
        int count = 1;
        //mentre count sigui igual o menor que el nombre entrat imprimirem el numero per pantalla i sumarem 1
        while (count <= max){
            System.out.println(count);
            count++;
        }
    }
}
