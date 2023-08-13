package br.guilherme.beecrowd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Guilherme
 */
public class MainTest {

    @Test
    public void when_Sum_Then_Result() {
        //given
        int a = 5;
        int b = 5;
        int esperado = a + b;
        int resultado;
        //when
        resultado = Main.soma(a, b);
        //then
        assertEquals(esperado, resultado);
    }
}
