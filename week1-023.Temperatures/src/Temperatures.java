
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        double value = reader.nextDouble();
        // Graph is used as follows:
        if (value > -30 && value < 40){
            Graph.addNumber(value);
        }
    }
}
