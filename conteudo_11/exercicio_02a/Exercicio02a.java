// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_11.exercicio_02a;

import java.util.Scanner;

public class Exercicio02a {
    public static void main(String[] args) {
        int totalClientes = 538;
        int cont = 0, bronze = 0, prata = 0, ouro = 0;
        double valor, volumeTotal = 0, somaBronze = 0, menorValor = Double.MAX_VALUE;
        String nome, classificacao, nomeMenor = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos clientes deseja cadastrar (padrão 538, digite <= 0 para usar 538): ");
        int limite = teclado.nextInt();
        teclado.nextLine();
        if (limite > 0) {
            totalClientes = limite;
        }

        while (cont < totalClientes) {
            System.out.print("Informe o nome do cliente: ");
            nome = teclado.nextLine();
            if (nome.trim().isEmpty() || nome.equalsIgnoreCase("FIM")) {
                break;
            }
            System.out.print("Informe o valor aplicado: ");
            valor = teclado.nextDouble();
            teclado.nextLine();

            if (valor <= 1000.00) {
                classificacao = "Bronze";
                bronze++;
                somaBronze += valor;
            } else if (valor <= 5000.00) {
                classificacao = "Prata";
                prata++;
            } else {
                classificacao = "Ouro";
                ouro++;
            }

            System.out.println("Cliente: " + nome + " | Classificação: " + classificacao);
            volumeTotal += valor;

            if (cont == 0 || valor < menorValor) {
                menorValor = valor;
                nomeMenor = nome;
            }

            cont++;
        }

        System.out.println("\nTotal de Bronze = " + bronze);
        System.out.println("Total de Prata = " + prata);
        System.out.println("Total de Ouro = " + ouro);
        if (bronze > 0) {
            System.out.printf("Média das aplicações dos clientes Bronze = R$ %.2f\n", (somaBronze / bronze));
        }
        System.out.printf("Volume total das aplicações = R$ %.2f\n", volumeTotal);
        System.out.println("Nome do aplicador de menor aplicação = " + nomeMenor);

        teclado.close();
    }
}
