import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int lenght;
    private Random random;
    String symbol = "abcdefghijklmnopqrstuvwxyz";
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenght=lenght;
    }

    public char createPassword() {
        // write code that returns a randomized password
        int count = 0;
        /*while (count < this.lenght){
            System.out.println(this.random.nextInt(26));
            System.out.print(symbol.charAt(this.random.nextInt(26)));
            count++;
        }*/
        return symbol.charAt(this.random.nextInt(25));
    }
}
