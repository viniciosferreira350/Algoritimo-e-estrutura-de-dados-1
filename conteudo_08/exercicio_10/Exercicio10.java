package conteudo_08.exercicio_10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int quantInsumos;
        double precoUnitario, quantidade, custoParcial, custoTotal = 0, maiorCusto = -1;
        String nome, nomeMaiorCusto = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número de insumos utilizados no projeto: ");
        quantInsumos = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= quantInsumos; aux++) {
            System.out.print("Informe o nome do insumo " + aux + ": ");
            nome = teclado.nextLine();
            System.out.print("Informe o preço unitário: ");
            precoUnitario = teclado.nextDouble();
            System.out.print("Informe a quantidade consumida: ");
            quantidade = teclado.nextDouble();
            teclado.nextLine();

            custoParcial = quantidade * precoUnitario;
            System.out.printf("Custo Parcial = R$ %.2f\n", custoParcial);
            custoTotal += custoParcial;

            if (aux == 1 || custoParcial > maiorCusto) {
                maiorCusto = custoParcial;
                nomeMaiorCusto = nome;
            }
        }

        if (quantInsumos > 0) {
            double media = custoTotal / quantInsumos;
            System.out.printf("\nCusto Total = R$ %.2f\n", custoTotal);
            System.out.printf("Média dos Custos Parciais = R$ %.2f\n", media);
            System.out.println("Nome do Insumo de maior custo parcial = " + nomeMaiorCusto);
        }

        teclado.close();
    }
}
