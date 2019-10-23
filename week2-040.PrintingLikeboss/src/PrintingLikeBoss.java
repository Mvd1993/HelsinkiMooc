public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0){
            System.out.print("*");
            amount -= 1;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0){
            System.out.print(" ");
            amount -= 1;
        }
        
    }
    public static void printStand(int size){
        int count = 2;
        while (count > 0){
            
            printWhitespaces(size -2);
            printStars(3);
            count -=1;
            
        }
    }
    public static void printTriangle(int size) {
        // 40.2
        int white = size -1;
        int stars = 1;
        while (white >=0){
            printWhitespaces(white);
            printStars(stars);
            white -=1;
            stars +=1;
           
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int white = height -1;
        int stars = 1;
        while (white >=0){
            printWhitespaces(white);
            printStars(stars);
            white -=1;
            stars +=2;
            
        }
        printStand(height);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
