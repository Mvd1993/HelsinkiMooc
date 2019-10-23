import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("type a word: ");
            String word=reader.nextLine();
            if (word.isEmpty()){
                System.out.println("you tipe the following words: ");
                int count = 0;
                while (count < words.size()){
                    System.out.println(words.get(count));
                    count++;
                }
                break;
            }
            words.add(word);} 
    }

  
   }