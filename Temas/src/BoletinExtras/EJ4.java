package BoletinExtras;

import java.util.Scanner;

public class EJ4 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas: ");
        int hora = sc.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos = sc.nextInt();

        System.out.println("Cuantas horas quieres sumar? ");
        int horaSumar = sc.nextInt();
        System.out.println("Cuantos minutos quieres sumar? ");
        int minutosSumar = sc.nextInt();
        System.out.println("Cuantos segundos quieres sumar? ");
        int segundosSumar = sc.nextInt();

        segundosSumar+=segundos;
        minutosSumar += segundosSumar / 60;
        horaSumar += minutosSumar / 60;
    }
}
