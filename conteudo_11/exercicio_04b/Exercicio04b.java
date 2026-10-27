package conteudo_11.exercicio_04b;

import java.util.Scanner;

public class Exercicio04b {
    public static void main(String[] args) {
        int cont = 0, somaIdades = 0, homens = 0, mulheres7Pontos = 0;
        int maiorIdade = -1, idade, pontos;
        double valorMulta, totalMultasValor = 0;
        String nome, sexo, nomeMaisVelho = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para encerrar digite X no nome (flag fictício)");
        System.out.print("Informe o nome do condutor: ");
        nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("X")) {
            System.out.print("Informe a idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Informe o sexo (M/F): ");
            sexo = teclado.nextLine();
            System.out.print("Informe a quantidade de pontos perdidos: ");
            pontos = teclado.nextInt();
            System.out.print("Informe o valor da multa: ");
            valorMulta = teclado.nextDouble();
            teclado.nextLine();

            somaIdades += idade;
            totalMultasValor += valorMulta;

            if (sexo.equalsIgnoreCase("M")) {
                homens++;
            }
            if (sexo.equalsIgnoreCase("F") && pontos == 7) {
                mulheres7Pontos++;
            }
            if (cont == 0 || idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelho = nome;
            }

            cont++;

            System.out.print("Informe o nome do condutor: ");
            nome = teclado.nextLine();
        }

        if (cont > 0) {
            double idadeMedia = (double) somaIdades / cont;
            double percHomens = (homens * 100.0) / cont;

            System.out.printf("Idade média dos condutores = %.2f\n", idadeMedia);
            System.out.printf("Valor total das multas aplicadas = R$ %.2f\n", totalMultasValor);
            System.out.printf("Percentual de homens multados = %.2f%%\n", percHomens);
            System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira = " + mulheres7Pontos);
            System.out.println("Pessoa mais velha: " + nomeMaisVelho + " com " + maiorIdade + " anos");
        }

        teclado.close();
    }
}
