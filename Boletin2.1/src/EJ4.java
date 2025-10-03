import java.util.Scanner;
import java.util.Random;

public class EJ4 {
    public static final int MAX_INTENTOS = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // de 1 a 100
        int intentos = 0;
        boolean acertado = false;

        System.out.println("Bienvenido al juego de adivinar el número (1-100).");
        System.out.println("Tienes " + MAX_INTENTOS + " intentos.");

        while (intentos < MAX_INTENTOS && !acertado) {
            System.out.print("Introduce un número entre 1 y 100: ");
            int numero = sc.nextInt();
            intentos++;

            if (numero < 1 || numero > 100) {
                System.out.println("El número debe estar entre 1 y 100. Cuenta como intento fallido.");
            } else if (numero == numeroSecreto) {
                acertado = true;
                System.out.println("🤑🤑🥳===========================================================🤑🤑🥳");
                System.out.println("¡Has acertado! El número secreto era " + numeroSecreto + ".");
                System.out.println("🤑🤑🥳===========================================================🤑🤑🥳");
            } else if (numero < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + numero + ".");
            } else {
                System.out.println("El número secreto es menor que " + numero + ".");
            }

            System.out.println("Intentos usados: " + intentos + "/" + MAX_INTENTOS + "\n");
        }

        if (!acertado) {
            System.out.println("🤣🖕🖕================================================================🤣\uD83D\uDD95\uD83D\uDD95");
            System.out.println("Has perdido jajaja. El número secreto era " + numeroSecreto + ".");
            System.out.println("🤣🖕🖕================================================================🤣\uD83D\uDD95\uD83D\uDD95");

        }
        sc.close();

    }

    public static int generarAleatorio(int max) {
        return (int) (Math.random() * max + 1);
    }

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}