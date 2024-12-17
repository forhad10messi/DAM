import java.util.Scanner;

public class condicional_ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Este programa pide dos números y calcula cual es mayor.");

        Scanner entrada=new Scanner(System.in);

        System.out.println("Escribe tu primer número");

        int num1=entrada.nextInt();

        System.out.println("Escribe tu segundo número");

        int num2=entrada.nextInt();
        //calculo de los dos numeros
        if (num1>num2){

            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1==num2){

            System.out.println(num1 + " es igual que " + num2);
        }else {
            System.out.println(num1 + " es menor que " + num2);
        }
    }
}
