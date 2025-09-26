import java.util.Scanner;

public class Ej5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numeros: ");

        int N = sc.nextInt();
        do {
            System.out.println("Introduce otro, hasta que sea negativo: ");

            if (N < 0) {
                System.out.println("Este numero es negativo. Fin");
            }
        } while (N >= 0);

        System.out.println("Has introducido " + N + " numeros");
    }
}
