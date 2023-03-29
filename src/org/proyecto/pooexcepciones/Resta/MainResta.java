package org.proyecto.pooexcepciones.Resta;

import javax.swing.*;

public class MainResta {
    public static void main(String[] args) {

        Resta res = new Resta();
        String denominador = JOptionPane.showInputDialog("Ingrese el denominador");
        String numerador = JOptionPane.showInputDialog("Ingrese el numerador");

        int suma;
        int suma1;

        try {
            suma = Integer.parseInt(denominador);
            suma1 = Integer.parseInt(numerador);
            suma1 = res.restar(suma,suma1);
            System.out.println("Total resta: " + suma1);
        } catch (NumeroRestaException nr){
            System.out.println("Se detecto un error: " + nr.getMessage());
            nr.printStackTrace(System.out);
            main(args);
        } finally {
            System.out.println("Se ejecuta sin o con sin!");
        }
    }
}
