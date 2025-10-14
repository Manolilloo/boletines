package Boletin2;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroA, numeroB;
        do {
            System.out.print("Introduce el primer número (mayor que 0): ");
            numeroA = sc.nextInt();
        } while (numeroA <= 0);

        do {
            System.out.print("Introduce el segundo número (mayor que 0): ");
            numeroB = sc.nextInt();
        } while (numeroB <= 0);

        int x = numeroA, y = numeroB;
        System.out.println("Pasos del algoritmo de Euclides:");
        while (y != 0) {
            int cociente = x / y;
            int resto = x % y;
            System.out.println(x + " : " + y + " = " + cociente + " y resto " + resto);
            x = y;
            y = resto;
        }

        System.out.println("El máximo común divisor de " + numeroA + " y " + numeroB + " es: " + x);

        sc.close();
    }
}
