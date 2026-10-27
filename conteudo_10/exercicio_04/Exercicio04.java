// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_10.exercicio_04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double bdi, quantidade, precoUnitario, custoParcial, custoTotal = 0, valorBdi, precoFinal;
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a taxa de BDI em %: ");
        bdi = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Para finalizar digite FIM no nome do material");
        do {
            System.out.print("Informe o nome do material: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.print("Informe a quantidade: ");
                quantidade = teclado.nextDouble();
                System.out.print("Informe o preço unitário: ");
                precoUnitario = teclado.nextDouble();
                teclado.nextLine();

                custoParcial = quantidade * precoUnitario;
                System.out.printf("Custo Parcial = %.2f\n", custoParcial);
                custoTotal += custoParcial;
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        valorBdi = custoTotal * bdi / 100.0;
        precoFinal = custoTotal + valorBdi;

        System.out.printf("Custo Total = %.2f\n", custoTotal);
        System.out.printf("BDI (%.0f%% de %.2f) = %.2f\n", bdi, custoTotal, valorBdi);
        System.out.printf("Preço Final (%.2f + %.2f) = %.2f\n", custoTotal, valorBdi, precoFinal);

        teclado.close();
    }
}
