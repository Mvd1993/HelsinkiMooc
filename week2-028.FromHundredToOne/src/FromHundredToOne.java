//Create a program that prints the integers (whole numbers) from 100 to 1.
public class FromHundredToOne {

    public static void main(String[] args) {
        //init counter
        int count = 100;
        //mentre count sigui igual o major que 0 imprimirem el numero per pantalla i restarem 1
        while (count >= 1){
            System.out.println(count);
            count--;
        }
    }
}
