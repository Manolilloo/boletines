import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2 && esPrimo; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
        entrada.close();
    }
}
