import java.util.Scanner;

public class EJ3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posiciones;
        System.out.println("Introduzca las posiciones que tendrá el array: ");
        posiciones = sc.nextInt();
        int num;

        for (int n = 1; n <= posiciones; n++) {
            System.out.println("Introduzca el numero "+n);
            num = sc.nextInt();
        }



    }
}
