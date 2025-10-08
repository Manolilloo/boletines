import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el coeficiente A: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el coeficiente B: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el coeficiente C: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else {
            double raiz = b * b - 4 * a * c;

            if (raiz > 0) {
                double x1 = (-b + Math.sqrt(raiz)) / (2 * a);
                double x2 = (-b - Math.sqrt(raiz)) / (2 * a);
                System.out.println("Dos soluciones: x1 = " + x1 + ", x2 = " + x2);
            } else if (raiz == 0) {
                double x = -b / (2 * a);
                System.out.println("Una solución: x = " + x);
            } else {
                System.out.println("No tiene soluciones reales.");
            }
        }

        sc.close();
    }
}