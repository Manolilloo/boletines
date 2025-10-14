package Boletin1;

import java.util.Scanner;

public class Ej6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número (A): ");
        long numeroA = scanner.nextInt();
        System.out.print("Introduce el segundo número (B): ");
        long numeroB = scanner.nextInt();

        long producto = 0;
        for (long i = 0; i < Math.abs(numeroB); i++) {
            producto += numeroA;
        }

        if (numeroB < 0) producto = -producto;
        System.out.println("El producto es: " + producto);
    }
}