package Boletin2;

public class EJ9 {
    public static void main(String[] args) {
        for (int tabla = 0; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
                int resultado = tabla * multiplicador;
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }
            System.out.println();
        }
    }
}