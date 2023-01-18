/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.operadorTres;
// import paquete04.*; <<< tambien 

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100); // operadoruno.(aqui se pone el nombre)(valores de la funcion)
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multi = operadorTres.obtenerMultiplicacion(suma, suma);
        System.out.printf("La suma de %d + %d es igual a: %d\n",
                valorA,
                valorB,
                suma);
        System.out.printf("La multiplicacion de %d + %d es igual a: %d\n",
                valorA,
                valorB,
                multi);
    }
}
// crear un paquete 05