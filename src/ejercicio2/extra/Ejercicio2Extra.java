/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.extra;

import ejercicio2.extra.Entidades.Puntos;
import java.text.DecimalFormat;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat redondear  = new DecimalFormat ("#.###");
        Puntos p1 = new Puntos();
        p1.crearPuntos();
        System.out.println(redondear.format(p1.calcularDistancia()));
    }
    
}
