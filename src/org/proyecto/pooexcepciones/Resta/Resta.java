package org.proyecto.pooexcepciones.Resta;

public class Resta {

    public int restar(int denominador, int numerador) throws NumeroRestaException{
        try {
            return denominador - numerador;
        } catch (NumberFormatException e){
            throw new NumeroRestaException("Por favor Ingrese un numero entero");
        }
    }



}
