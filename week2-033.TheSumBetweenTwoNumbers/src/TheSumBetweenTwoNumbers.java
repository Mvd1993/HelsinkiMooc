//Similar to the previous exercise, except that the program should ask for both 
//the lower and upper bound. You can assume that the users first gives the smaller 
//number and then the greater number.

import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ask for the first number
        System.out.println("First: ");
        int First = reader.nextInt();
        //ask for the second number
        System.out.println("Second: ");
        int Second = reader.nextInt();
        //init the count
        int count = 0;
        // sum all the numbers between the first and the second number
        while (First <= Second){
            count = count + First;
            First++;
        }
        System.out.println(count);
        
    }
}
