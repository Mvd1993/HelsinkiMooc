//Create a program that asks the user for the first number and the last number 
//and then prints all numbers between those two.
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ask for the min number
        System.out.println("First:");
        int min = reader.nextInt();
        //ask for the max number
        System.out.println("Last:");
        int max = reader.nextInt();
        //mentre count sigui igual o menor que el nombre entrat imprimirem el numero per pantalla i sumarem 1
        while (min <= max){
            System.out.println(min);
            min++;
            }
        
    }
}