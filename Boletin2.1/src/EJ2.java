import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, exponente;

        do {
            System.out.print("Introduce la base: ");
            base = sc.nextInt();

            System.out.print("Introduce el exponente: ");
            exponente = sc.nextInt();

            if (base < 0 || exponente < 0) {
                System.out.println("Error: ambos números deben ser mayores o iguales que 0. Inténtalo de nuevo.");
            }

        } while (base < 0 || exponente < 0);

        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + exponente + " = " + resultado);
    }
}
