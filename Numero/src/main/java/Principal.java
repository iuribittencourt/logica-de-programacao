import java.util.Scanner;

/**
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 14/06/2020 - 00:10
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Numero numero = new Numero();

        System.out.println(numero.escreverNumerosDeZeroAVinte());
        System.out.println(numero.escreverNumerosParesDeZeroAVinte());
        System.out.println(numero.escreverNumerosImparesDeZeroAVinte());

        System.out.println("Digite o inicio:");
        int inicio = scanner.nextInt();
        System.out.println("Digite o fim:");
        int fim = scanner.nextInt();
        System.out.println(numero.escreverNumerosConformeIntervalo(inicio, fim));

        System.out.println("Digite o inicio:");
        int inicioo = scanner.nextInt();
        System.out.println("Digite o fim:");
        int fimm = scanner.nextInt();
        System.out.println("Digite o step:");
        int step = scanner.nextInt();
        System.out.println(numero.escreverNumerosConformeIntervaloStep(inicio, fim, step));
    }
}
