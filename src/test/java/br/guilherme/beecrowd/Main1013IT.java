package br.guilherme.beecrowd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Guilherme
 */
public class Main1013IT {
        /**
     * Test of maior method, of class Main1013.
     */
    @Test
    public void testMaior() {
        //given
        int a = -10;
        int b = 100;
        int esperado = b;
        int resultado = 0;
        //when
        resultado = Main1013.maior(a, b);
        //then
        assertEquals(esperado, resultado);
    }
    
}
