import java.util.Scanner;

public class Ej10 {
    static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero positivo");

        num = sc.nextInt();

        while (num < 0) {
            System.out.println("Error, pon un numero positivo");
        }

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("El factorial de " + num + " es " + fact);
    }
}
