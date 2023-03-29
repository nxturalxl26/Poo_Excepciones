package org.proyecto.pooexcepciones.divisiones;

import org.proyecto.pooexcepciones.sumatoria.NumeroFormatoException;

public class Calculadora {






    public double dividirPorCero(int numerador, int denominador) throws DivisionPor0Exception {
        if (denominador == 0){
           throw new DivisionPor0Exception("No se puede dividir por cero");
        }
        return numerador/(double) denominador;
    }

    public double dividir(String numerador, String divisor ) throws DivisionPor0Exception,
            NumeroFormatoException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividirPorCero(num,div);
        } catch (NumberFormatException nfe){
            throw new NumeroFormatoException("Debe ingresar un numero en el de numerador y denominador");
        }

    }



}
