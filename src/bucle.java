import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {

        int aleatorio= (int) Math.random()*100;

        Scanner entrada= new Scanner(System.in);

        int numero=0;
        int intentos=0;

        while (numero !=aleatorio) {

            intentos++;

            System.out.println("Introduce un numero");

            numero=entrada.nextInt();

            if (aleatorio < numero) {
                System.out.println("El numero es aun mas bajo");

            } else if (aleatorio > numero) {
                System.out.println("El numero es aun mas alto");
            }
            System.out.println("Has adivinado el numero");
        }
    }
}
