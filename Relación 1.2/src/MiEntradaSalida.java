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

    public static int leerEnteroRango(String mensaje, int min, int max) {
        System.out.println("Introduce un numero entre " + min + " y " + max + ": ");
        if (min >= max) {
            System.out.println("Error: el valor mínimo debe ser menor que el valor máximo.");
            return -1;
            //TODO: Cambiar esto al ver las excepciones
        return sc.nextInt();
    }
}