/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.guilherme.beecrowd;

import static br.guilherme.beecrowd.Main1002.calcularArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
