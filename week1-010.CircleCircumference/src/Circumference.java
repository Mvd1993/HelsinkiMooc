
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
	// llegim l'input del radi del cercle
	float radi = reader.nextFloat();
	//calculem la circumferencia;
	float circumferencia = (float) (radi * 2 * Math.PI);
	System.out.println("Circumference of the circle:"+circumferencia);
    }
}
