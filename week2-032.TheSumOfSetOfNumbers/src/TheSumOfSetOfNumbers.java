//Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ask for the max number
        int max = reader.nextInt();
        //init the count and the sum
        int count = 0;
        int sum = 0;
        //add the value of count to sum until count = max
        while (count <= max){
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
