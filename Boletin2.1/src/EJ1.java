import java.util.Scanner;

public class EJ1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Pon un numero: ");
        n1 = sc.nextInt();
        System.out.println("Pon otro: ");
        n2 = sc.nextInt();
        System.out.println("Pon otro: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println("El orden de menor a mayor es: "+n1+">"+n2+">"+n3);
        }
        if (n1 > n3 && n3 > n2) {
            System.out.println("El orden de menor a mayor es: "+n1+">"+n3+">"+n2);
        }
        if (n2 > n1 && n1 > n3) {
            System.out.println("El orden de menor a mayor es: "+n2+">"+n1+">"+n3);
        }
        if (n2 > n3 && n3 > n1) {
            System.out.println("El orden de menor a mayor es: "+n2+">"+n3+">"+n1);
        }
        if (n3 > n2 && n2 > n1) {
            System.out.println("El orden de menor a mayor es: "+n3+">"+n2+">"+n1);
        }
        if (n3 > n1 && n1 > n2) {
            System.out.println("El orden de menor a mayor es: "+n3+">"+n1+">"+n2);
        }
        if (n1 == n2 && n2 == n3) {
            System.out.println("Los tres son iguales.");
        }
    }
}
