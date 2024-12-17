import java.util.Scanner;

public class condicional_ejercicio5 {
    public static void main(String[] args) {

        /* Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
    * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
    * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
    * Otros casos -> NO ACEPTADA */

        System.out.println("Rellana los parametros:");
        //entrada de datos
        Scanner entrada=new Scanner(System.in);

        int nota;
        int edad;
        float sexo;
        //salida de datos
        System.out.print("Ponga la nota del 1 al 10:");

        nota =entrada.nextInt();

        System.out.print("Ponga la edad que tiene:");

        edad= entrada.nextInt();

        System.out.print("Ponga su sexo M o F:");

        sexo= entrada.nextLine();

        if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")){

            System.out.println("Valor introducido no válido");
        } else if ((nota>=5) && (edad>=18) && (sexo.toUpperCase().equals("M"))){

            System.out.println("posible");
        }/*else {
            System.out.println("Eres un meco");
        }*/

    }
}
