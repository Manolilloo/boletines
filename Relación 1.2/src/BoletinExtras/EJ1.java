package BoletinExtras;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero, te dare su inversa.");
        int numero = scanner.nextInt();
        int numerin = numero;
        while (numero < 0) {
            System.out.println("El numero debe ser positivo, dime otro.");
            numero = scanner.nextInt();
        }
        int inversa = 0;
        int resto;
        while (numero > 0) {
            resto = numero % 10;
            inversa = inversa * 10 + resto;
            numero /= 10;
        }
        System.out.println("La inversa es: " + inversa);

        if (numerin == inversa) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
        scanner.close();
    }
}