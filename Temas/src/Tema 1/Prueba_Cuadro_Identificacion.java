package Boletin1;

import javax.swing.*;

public class Prueba_Cuadro_Identificacion {
    static void main(String[] args) {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu edad: "));
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + "Edad: " + edad);
    }
}