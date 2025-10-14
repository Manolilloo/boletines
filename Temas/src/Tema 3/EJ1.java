package Boletin3;

public class EJ1 {
    static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        int suma = 0;

        for (int i = 0; i < numeros.length; i+=2) {
                suma += numeros[i];
        }
        System.out.println("La suma de todas las posiciones pares es :"+suma);

    }
}
