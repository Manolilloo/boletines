package Boletin1;

import java.util.Scanner;

public class Ej4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = sc.nextInt();
        do {
            if (num <= 0) {
                System.out.println("Error: el número debe ser estrictamente positivo.");
            }
        } while (num <= 0);

        int suma = num * (num + 1) / 2; // chatgpt, sino, no lo saco

        System.out.println("La suma de los " + num + " primeros numeros es: " + suma);
    }
}
