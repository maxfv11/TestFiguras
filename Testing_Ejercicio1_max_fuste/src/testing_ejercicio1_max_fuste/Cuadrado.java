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
public class Cuadrado {
    private static double area;
    private static int perimetro;
    private static int lado;
    private static int base;
    private static int altura;

    public static double getArea( double base, double altura) {
        area=base*altura;
        return area;
    }

    public static int getPerimetro(int lado) {
        perimetro=lado*4;
        return perimetro;
    }
    
}
