import java.util.Scanner;

/**
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 08/06/2020 - 22:50
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        int opcao = 0;
        do {

            System.out.println("Digite o primeiro numero");
            calculadora.setNumero1(scanner.nextDouble());

            System.out.println("Digite o segundo numero");
            calculadora.setNumero2(scanner.nextDouble());

            System.out.println("1-somar\n2-subtrair\n3-multiplicar\n4-dividir\n5-todos\n6-sair");
            opcao = scanner.nextInt();

            System.out.println(calculadora.verificarOpcao(opcao));

        } while(opcao != 6);

    }
}
