package br.guilherme.Algoritmos.Beecrowd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.guilherme.Algoritmos.Beecrowd.Main1002.calcularArea;

/**
 *
 * @author Guilherme
 */    
public class Main1002T {
    
    @Test
    public void testCalcularArea() {
        //given
        double raio = 150.00;
        double pi = 3.14159;
        String esperado = "70685.7750"; 
        String resultado;
        //when
        resultado = calcularArea(pi, raio);
        //then
        Assertions.assertEquals(esperado, resultado);
    }
    
}
