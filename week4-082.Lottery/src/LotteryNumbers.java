import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        random = new Random();
        this.drawNumbers();
        Collections.sort(this.numbers);
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int count =0;
        while (count < 7){
            int number =  this.random.nextInt(39)+1;
            if (!this.containsNumber(number)){
                numbers.add(number);
                count++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int num: numbers){
            if (num == number){
                return true;
            }
        }
        return false;
    }
}
