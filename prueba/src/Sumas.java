public class Sumas {

    static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 100; i = i+2) {
            a += i;
        }
        System.out.println("La suma de los numeros del 1 al 100 es " + a);
    }
}