package conteudo_10.exercicio_08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        String nome, cidadeMenorPop = "";
        long populacao, eleitores, homens, mulheres;
        long totalPopulacao = 0, totalEleitores = 0, totalHomens = 0, menorPop = Long.MAX_VALUE;
        int totalCidades = 0, cidadesMaisMulheres = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Para finalizar informe a cidade Zimbabue de Minas (flag real)");

        do {
            System.out.print("Informe o nome da cidade: ");
            nome = teclado.nextLine();
            System.out.print("Informe a população: ");
            populacao = teclado.nextLong();
            System.out.print("Informe a quantidade de eleitores: ");
            eleitores = teclado.nextLong();
            System.out.print("Informe a quantidade de homens: ");
            homens = teclado.nextLong();
            System.out.print("Informe a quantidade de mulheres: ");
            mulheres = teclado.nextLong();
            teclado.nextLine();

            if (homens + mulheres != populacao) {
                System.out.println("Atenção: A soma de homens e mulheres (" + (homens + mulheres) + ") é diferente da população (" + populacao + ") na cidade " + nome);
            }

            totalCidades++;
            totalPopulacao += populacao;
            totalEleitores += eleitores;
            totalHomens += homens;

            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            if (totalCidades == 1 || populacao < menorPop) {
                menorPop = populacao;
                cidadeMenorPop = nome;
            }

        } while (!nome.equalsIgnoreCase("Zimbabue de Minas"));

        double percEleitores = (totalEleitores * 100.0) / totalPopulacao;
        double mediaHomens = (double) totalHomens / totalCidades;

        System.out.println("Total de cidades = " + totalCidades);
        System.out.println("População total = " + totalPopulacao);
        System.out.printf("Percentual de eleitores = %.3f%%\n", percEleitores);
        System.out.println("Cidades com mais mulheres que homens = " + cidadesMaisMulheres);
        System.out.printf("Média de homens = %.3f\n", mediaHomens);
        System.out.println("Cidade com menor população = " + cidadeMenorPop);

        teclado.close();
    }
}
