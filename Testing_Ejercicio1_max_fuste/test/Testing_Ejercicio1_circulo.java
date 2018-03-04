
import org.junit.Test;
import org.junit.Assert;
import testing_ejercicio1_max_fuste.Circulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Max
 */
public class Testing_Ejercicio1_circulo {
    
    
    @Test
    public void testcirculo(){
               double result = Circulo.getArea(2); 
               Assert.assertEquals(2, result,0.1);
            }
    @Test
    public void testPerimetro(){
                int perimetroResul=Circulo.getPerimetro(6);
                Assert.assertEquals(18, perimetroResul,0.1);
    }

    
    
}
