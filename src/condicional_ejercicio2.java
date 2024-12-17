import java.util.Scanner;

public class condicional_ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Este programa calcula si un numero es par o impar.");
        //entrada de datos
        Scanner entrada=new Scanner(System.in);

        System.out.println("Escribe tu número");

        int num1=entrada.nextInt();
        // calculamos si es par o impar
        if (num1 % 2==0){//% 2==0 (donde % calcula el resto de 2, si no sale 0 es impar

            System.out.println("Su numero es par");
        }else {
            System.out.println("Su numero es impar");
        }
    }
}
