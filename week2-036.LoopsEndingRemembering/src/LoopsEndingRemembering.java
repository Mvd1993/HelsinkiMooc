import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        while (true){
            int read = reader.nextInt();
            if (read == -1){
                double avg = (double)sum /count;
                System.out.println("Thank you and see you later");
                System.out.println("The sum is "+sum);
                System.out.println("How many numbers: "+count);
                System.out.println("Average: "+avg);
                System.out.println("Even numbers: "+even);
                System.out.println("Odd numbers: "+odd);
                break;
            }
            if (read%2 == 0){even += 1;}
            else{odd+=1;}
            sum += read;
            count += 1;
        }
    }
}
