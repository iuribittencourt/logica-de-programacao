import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 15/06/2020 - 08:54
 */
class NumeroTest {

    private Numero numero = new Numero();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void escreverNumerosDeZeroAVinte() {
        assertEquals("\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20", numero.escreverNumerosDeZeroAVinte());
    }

    @org.junit.jupiter.api.Test
    void escreverNumerosParesDeZeroAVinte() {
        assertEquals("\n0\n2\n4\n6\n8\n10\n12\n14\n16\n18\n20", numero.escreverNumerosParesDeZeroAVinte());
    }

    @org.junit.jupiter.api.Test
    void escreverNumerosImparesDeZeroAVinte() {
        assertEquals("\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19", numero.escreverNumerosImparesDeZeroAVinte());
    }

    @org.junit.jupiter.api.Test
    void escreverNumerosConformeIntervalo() {
        assertEquals("\n5\n6\n7", numero.escreverNumerosConformeIntervalo(5,7));
    }

    @org.junit.jupiter.api.Test
    void escreverNumerosConformeIntervaloStep() {
        assertEquals("\n0\n3\n6\n9", numero.escreverNumerosConformeIntervaloStep(0,10,3));
    }

}