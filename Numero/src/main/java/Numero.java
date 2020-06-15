/**
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 14/06/2020 - 00:11
 */
public class Numero {


    public Numero() {
    }

    /**
     *
     * @return
     */
    public String escreverNumerosDeZeroAVinte() {
        int contador = 0;
        StringBuilder numeros = new StringBuilder();
        while(contador <= 20) {
            numeros.append("\n"+contador);
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @return
     */
    public String escreverNumerosParesDeZeroAVinte() {
        int contador = 0;
        StringBuilder numeros = new StringBuilder();
        while(contador <= 20) {
            if(contador % 2 == 0) {
                numeros.append("\n"+contador);
            }
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @return
     */
    public String escreverNumerosImparesDeZeroAVinte() {
        int contador = 0;
        StringBuilder numeros = new StringBuilder();
        while(contador <= 20) {
            if(contador % 2 != 0) {
                numeros.append("\n"+contador);
            }
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @param  inicio
     * @param  fim
     * @return retorna conforme o intervalo
     */
    public String escreverNumerosConformeIntervalo(int inicio, int fim) {
        int contador = inicio;
        StringBuilder numeros = new StringBuilder();
        while(contador <= fim) {
            numeros.append("\n"+contador);
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @param   inicio
     * @param  fim
     * @param step
     * @return
     */
    public String escreverNumerosConformeIntervaloStep(int inicio, int fim, int step) {
        int contador = inicio;
        StringBuilder numeros = new StringBuilder();
        while(contador <= fim) {
            numeros.append("\n"+contador);
            contador = contador + step;
            //abreviação
            //contador+=step;
        }
        return numeros.toString();
    }
}