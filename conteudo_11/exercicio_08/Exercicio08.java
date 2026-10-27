// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_11.exercicio_08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double valorHora, horas, salario, premio, totalFolha = 0, somaHoras = 0, maiorSalario = -1;
        String nome, funcao, nomeMaior = "", funcaoMaior = "";
        int totalPessoas = 0, faixa1 = 0, faixa2 = 0, faixa3 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor da hora trabalhada no projeto: ");
        valorHora = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Para finalizar digite FIM no nome");
        System.out.print("Informe o nome do trabalhador: ");
        nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Informe a função: ");
            funcao = teclado.nextLine();
            System.out.print("Informe a quantidade de horas trabalhadas: ");
            horas = teclado.nextDouble();
            teclado.nextLine();

            if (horas <= 100) {
                premio = 1000.00;
                faixa1++;
            } else if (horas <= 500) {
                premio = 10.00 * horas;
                faixa2++;
            } else {
                premio = ((int)(horas / 10)) * 100.00;
                faixa3++;
            }

            salario = (horas * valorHora) + premio;
            System.out.printf("Trabalhador: %s | Valor a receber = R$ %.2f\n", nome, salario);

            somaHoras += horas;
            totalFolha += salario;
            totalPessoas++;

            if (totalPessoas == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                funcaoMaior = funcao;
            }

            System.out.print("Informe o nome do trabalhador: ");
            nome = teclado.nextLine();
        }

        if (totalPessoas > 0) {
            double mediaHoras = somaHoras / totalPessoas;
            System.out.printf("\nMédia de horas trabalhadas por pessoa = %.2f\n", mediaHoras);
            System.out.printf("Pessoa com maior salário: %s (%s) com R$ %.2f\n", nomeMaior, funcaoMaior, maiorSalario);
            System.out.println("Quantidade por faixa de prêmio:");
            System.out.println("  Até 100h: " + faixa1);
            System.out.println("  101 a 500h: " + faixa2);
            System.out.println("  Acima de 500h: " + faixa3);
            System.out.printf("Valor total da folha de pagamento = R$ %.2f\n", totalFolha);
        }

        teclado.close();
    }
}
