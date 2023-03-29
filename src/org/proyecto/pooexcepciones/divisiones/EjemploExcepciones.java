package org.proyecto.pooexcepciones.divisiones;

import org.proyecto.pooexcepciones.divisiones.Calculadora;
import org.proyecto.pooexcepciones.divisiones.DivisionPor0Exception;
import org.proyecto.pooexcepciones.sumatoria.NumeroFormatoException;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args)  {

       Calculadora cal = new Calculadora();

        String denominador = JOptionPane.showInputDialog("Ingreese un numero entero denominador");
        String numerador = JOptionPane.showInputDialog("Ingreese un numero entero numerador");

        try{
            double division2 = cal.dividir(denominador,numerador);
            System.out.println("Se divide por : " + division2);

        } catch (NumberFormatException e){
            System.out.println("Se detecto un problema ingrese un numero!");
            e.printStackTrace(System.out);
            main(args);
        } catch (NumeroFormatoException nfe){
            System.out.println("Se detecto una excepcion: ingrese un numero valido: " + nfe.getMessage());
            nfe.printStackTrace(System.out);
            main(args);
        }
        catch (DivisionPor0Exception dpe){
            System.out.println("Capturamos la excepcion en tiempo de ejecuccion: " + dpe.getMessage());
        } finally {
            System.out.println("Seguimos con la ejecuccion sin o sin!");
        }
        System.out.println("Continuamos!");


    }
}
