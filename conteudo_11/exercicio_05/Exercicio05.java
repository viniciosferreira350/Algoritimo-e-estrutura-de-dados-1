// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_11.exercicio_05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String nome;
        int opcao, totalAlunos = 0, alunosIngles = 0;
        double mensalidade, totalGeral = 0;
        double totalIngles = 0, totalFrances = 0, totalEspanhol = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para encerrar o programa digite FIM no nome");
        System.out.print("Informe o nome do aluno: ");
        nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Informe o código da opção (1-Inglês, 2-Francês, 3-Espanhol): ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                mensalidade = 100.00;
                alunosIngles++;
                totalIngles += mensalidade;
            } else if (opcao == 2) {
                mensalidade = 150.00;
                totalFrances += mensalidade;
            } else if (opcao == 3) {
                mensalidade = 120.00;
                totalEspanhol += mensalidade;
            } else {
                mensalidade = 0.00;
                System.out.println("Opção inválida!");
            }

            System.out.printf("Aluno: %s | Mensalidade: R$ %.2f\n", nome, mensalidade);
            totalGeral += mensalidade;
            totalAlunos++;

            System.out.print("Informe o nome do aluno: ");
            nome = teclado.nextLine();
        }

        System.out.println("\nQuantidade de alunos matriculados nas turmas de Inglês = " + alunosIngles);
        if (totalAlunos > 0) {
            double media = totalGeral / totalAlunos;
            System.out.printf("Mensalidade média da escola = R$ %.2f\n", media);
        }
        System.out.printf("Valor total Inglês = R$ %.2f\n", totalIngles);
        System.out.printf("Valor total Francês = R$ %.2f\n", totalFrances);
        System.out.printf("Valor total Espanhol = R$ %.2f\n", totalEspanhol);

        teclado.close();
    }
}
