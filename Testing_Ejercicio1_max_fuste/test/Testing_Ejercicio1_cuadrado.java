
import org.junit.Assert;
import org.junit.Test;
import testing_ejercicio1_max_fuste.Cuadrado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Max
 */
public class Testing_Ejercicio1_cuadrado {
    
    @Test
    public void testAreaCuadrado(){
               double cuadradoArea=Cuadrado.getArea(4, 2);
               Assert.assertEquals(8, cuadradoArea,0.1);
    }
    
    
    @Test
    public void testPerimetroCuadrado(){
               int cuadradoperimetro=Cuadrado.getPerimetro(4);
               Assert.assertEquals(16, cuadradoperimetro,0.1);
    }
}
