import java.util.Scanner;

public class WhileEjemplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num = sc.nextInt();
        int div = 2;
        while (div <= num / 2 && num % div != 0) {
            div++;
        }
        if (num % div == 0) {
            System.out.println("El primer divisor de " + num + " es: " + div);
        } else {
            System.out.println("El número %d es primo".formatted(num));
        }
        sc.close();


    }
}
