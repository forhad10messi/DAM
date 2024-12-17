import java.util.Scanner;

public class SWITCH_EJ1 {
    public static void main(String[] args) {
        System.out.println("Vamos a operar entre dos numeros");
        Scanner entrada= new Scanner(System.in);
        char operador;
        int x,y,resultado;
        System.out.print("Escribe tu perimer numero: ");
        Scanner x= entrada.nextInt();
        System.out.print("Escribe tu segundo numero: ");
        Scanner y= entrada.nextInt();
        System.out.print("Escribe el operador + - * / : ");

        switch (operador){

            case "-":
                resultado= x-y;
                System.out.println("La resta es: " +resultado);
                break;
            case "+":


        }

    }
}
