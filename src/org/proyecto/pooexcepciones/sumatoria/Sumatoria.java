package org.proyecto.pooexcepciones.sumatoria;

import org.proyecto.pooexcepciones.divisiones.NumeroSumatoriaFormatException;

public class Sumatoria {

    public int sumatoria(int numerador, int denominador) throws NumeroSumatoriaFormatException {
        try {
            return numerador + denominador;
        } catch (NumberFormatException nfe){
            throw  new NumeroSumatoriaFormatException("Ingrese un entero por favor");
        }
    }
}
