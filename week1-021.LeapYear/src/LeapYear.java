
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("type a year");
        Scanner reader = new Scanner(System.in);
         //ask for a year
        int year = reader.nextInt();
        //check if it's a leap year
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("The year is a leap year.");
        }
        else{
            System.out.println("The year is not a leap year.");
        }
    }
}
