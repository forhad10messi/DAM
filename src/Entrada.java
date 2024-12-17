
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        System.out.println("Ponga su edad para saber la tarifa:");

        Scanner entrada=new Scanner(System.in);

        System.out.println("¿Que edad tiene usted?");

        int edad=entrada.nextInt();

        if (edad<=4){

            System.out.println("No tiene que pagar la entrada");
        } else if (edad<=18) {
            System.out.println("Tiene que pagar 5 euros");
        }else {
            System.out.println("Tiene que pagar 10 euros");
        }

    }
}
