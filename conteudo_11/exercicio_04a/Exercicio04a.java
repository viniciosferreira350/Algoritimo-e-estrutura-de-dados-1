// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_11.exercicio_04a;

import java.util.Scanner;

public class Exercicio04a {
    public static void main(String[] args) {
        int totalMultas = 230, cont = 0, somaIdades = 0, homens = 0, mulheres7Pontos = 0;
        int maiorIdade = -1, idade, pontos;
        double valorMulta, totalMultasValor = 0;
        String nome, sexo, nomeMaisVelho = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas multas deseja processar (padrão 230, digite <= 0 para 230): ");
        int limite = teclado.nextInt();
        teclado.nextLine();
        if (limite > 0) {
            totalMultas = limite;
        }

        while (cont < totalMultas) {
            System.out.print("Informe o nome do condutor (ou FIM para encerrar): ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM") || nome.trim().isEmpty()) {
                break;
            }

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
