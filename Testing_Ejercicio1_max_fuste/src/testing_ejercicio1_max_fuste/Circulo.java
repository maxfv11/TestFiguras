/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_ejercicio1_max_fuste;

/**
 *
 * @author Max
 */
public class Circulo {
    private static double area;
    private static int perimetro;
    private static int diametro;
    private static int radio;

    public static double getArea(double n) {
        area = n;
        return area;
    }

    public static int getPerimetro(int diametro) {
        radio=diametro/2;
        perimetro=diametro*radio;
        return perimetro;
    }
    
   
    
}
