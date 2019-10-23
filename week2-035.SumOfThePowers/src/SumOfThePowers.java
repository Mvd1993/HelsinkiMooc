
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int N = reader.nextInt();
        int sum = 0; 
        while (N >= 0){
            sum = sum + (int)Math.pow(2, N);
            N = N-1;
        }
        
        System.out.println("The result is "+sum);
    }
}
