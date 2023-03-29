package org.proyecto.pooexcepciones.sumatoria;

import org.proyecto.pooexcepciones.divisiones.NumeroSumatoriaFormatException;

import javax.swing.*;

public class MainSumar {
    public static void main(String[] args) {

        Sumatoria sum = new Sumatoria();
        String denominador = JOptionPane.showInputDialog("Ingrese el denominador");
        String numerador = JOptionPane.showInputDialog("Ingrese el numerador");

        int suma;
        int suma1;

        try{
            suma = Integer.parseInt(denominador);
            suma1 = Integer.parseInt(numerador);
          suma1 = sum.sumatoria(suma,suma1);
            System.out.println("suma1 = " + suma1);
        } catch (NumberFormatException nfe){
            System.out.println("Se a detectado un error ingrese un numero entero!" + nfe.getMessage());
            nfe.printStackTrace(System.out);
            main(args);
        }
        catch (NumeroSumatoriaFormatException e){
            System.out.println("Se detecto un error: " + e.getMessage());
            e.printStackTrace(System.out);
            main(args);
        } finally {
            System.out.println("Ejecuccion en marcha si o con sin!");
        }
        System.out.println("Seguimos!");
    }
}
