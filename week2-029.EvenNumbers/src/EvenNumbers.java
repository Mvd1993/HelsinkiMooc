//Create a program that prints all even numbers between 2 and 100.
public class EvenNumbers {

    public static void main(String[] args) {
        //init counter
        int count = 1;
        //mentre count sigui igual o menor que 100 imprimirem el numero per pantalla i sumarem 1
        while (count <= 100){
            //comprovem si el numero es parell i si ho es l'imprimim
            if (count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }
    }
}