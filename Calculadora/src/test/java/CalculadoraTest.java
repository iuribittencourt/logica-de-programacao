import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @BeforeEach
    void setUp() {
        calculadora.setNumero1(10);
        calculadora.setNumero2(2);
    }

    @Test
    void somar() {
        assertEquals(12.0, calculadora.somar());
    }

    @Test
    void subtrair() {
        assertEquals(8.0, calculadora.subtrair());
    }

    @Test
    void multiplicar() {
        assertEquals(20.0, calculadora.multiplicar());
    }

    @Test
    void dividir() {
        assertEquals(5.0, calculadora.dividir());
    }
}