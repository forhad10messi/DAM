import java.util.Scanner;

public class Dia_de_la_semana {

    public static void main(String[] args) {

        Scanner entrada= new Scanner (System.in);

        System.out.println("Introduzca un dia de la semana");

        String leer=entrada.nextLine();

        switch (leer){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":

                System.out.println("Estamos entresemana");
                break;
            case "sabado":
            case "Domingo":
                System.out.println("Ten un estupendo finde");
                break;
            default:
                System.out.println("Introduzca un dia de la semana");



        }
    }
}
