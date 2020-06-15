/**
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 08/06/2020 -  22:40
 */
public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {
    }

    /**
     *
     * @param numero1
     * @param numero2
     */
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     *
     * @return soma
     */
    public double somar() {
        return this.numero1 + this.numero2;
    }


    /**
     *
     * @return subtração
     */
    public double subtrair() {
        return this.numero1 - this.numero2;
    }

    /**
     *
     * @return multiplicação
     */
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    /**
     *
     * @return divisão
     */
    public double dividir() {
        return this.numero1 / this.numero2;
    }

    /**
     *
     * @return verifica a opção
     */
    public String verificarOpcao(int opcao) {
        switch(opcao) {
            case 1: return "Soma: " + this.somar();
            case 2: return "Subtração: " + this.subtrair();
            case 3: return "Multiplicação: " + this.multiplicar();
            case 4: return "Divisão: " + this.dividir();
            case 5: return toString();
            case 6: System.exit(0);
                return null;
            default: return toString();
        }
    }

    @Override
    public String toString() {
        return "\nnumero1 = " + numero1
                + "\nnumero2 = " + numero2
                + "\nSoma = " + this.somar()
                + "\nSubtração = " + this.subtrair()
                + "\nMultiplicação = " + this.multiplicar()
                + "\nDivisão = " + this.dividir();
    }
}
