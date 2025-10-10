package Boletin3;

public class EJ2 {
    static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5, -6};
        int numNegativos = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i]<0) {
                numNegativos++;
            }
        }
        System.out.println("El numero de numeros negativos es : "+numNegativos);
    }
}
