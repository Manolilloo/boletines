import java.util.Scanner;

public class MiEntradaSalida {
    private static Scanner sc = new Scanner(System.in);

    /*
     * Lee un entero mostrando el mensaje pasado como parámetro
     * @param nebsaje El mensaje a mostrar
     * @return el entero leído por teclado
     */

    public static int leerEntero(String mensaje) {
        System.out.println("Introduce un número");
        return sc.nextInt();
    }

    public static int leerEnteroPositivo(String mensaje) {
        System.out.println("Introduce un numero positivo: ");
        return sc.nextInt();
    }

    static void main(String[] args) {
        int b = MiEntradaSalida.leerEnteroPositivo("Introduce un numero entero positivo");
        while (b < 0) {
            System.out.println("--->" + b + " no es un numero positivo, por lo tanto, barrigon.");
            b = sc.nextInt();
        }
        if (b >= 0) {
            System.out.println("El numero que has introducido es: " + b);
        }
    }
}