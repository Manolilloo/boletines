package Boletin1;

import java.util.Scanner;

public class Ej2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabla de multiplicar");
        System.out.println("Pon un número");

        int num = scanner.nextInt();

        if (num >= 0 && num <= 10) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + "*" + i + "=" + (num * i));
            }
        }
        else{
            System.out.println("error");
        }
        scanner.close();
    }
}