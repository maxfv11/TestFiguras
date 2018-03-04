
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
public class Testing_Ejercicio1_Comparador {
    
    @Test
    public void comparaArea(){
               double cuadradoArea=Cuadrado.getArea(5, 2);
               Assert.assertEquals(10, cuadradoArea,0.1);
    }
    
    
    @Test
    public void comparaPerimetro(){
               int cuadradoperimetro=Cuadrado.getPerimetro(5);
               Assert.assertEquals(20, cuadradoperimetro,0.1);
    }
    
}
