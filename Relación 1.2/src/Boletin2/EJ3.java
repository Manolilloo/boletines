package Boletin2;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int numeroAbsoluto = Math.abs(numero);


        int cifras = 0;
        if (numeroAbsoluto == 0) {
            cifras = 1;  // caso especial
        } else {
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10;
                cifras++;
            }
        }


        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
    }
}