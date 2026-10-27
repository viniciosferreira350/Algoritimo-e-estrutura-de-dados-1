// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double nota, somaNotasAprovados = 0;
        int faltas, aprovados = 0, mais16Faltas = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para interromper digite -1 na nota final");
        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe a nota final do aluno " + aux + ": ");
            nota = teclado.nextDouble();
            if (nota == -1) {
                break;
            }
            System.out.print("Informe o total de faltas: ");
            faltas = teclado.nextInt();

            if (nota >= 65 && faltas <= 16) {
                System.out.println("ALUNO APROVADO");
                somaNotasAprovados += nota;
                aprovados++;
            } else {
                System.out.println("ALUNO REPROVADO");
            }

            if (faltas > 16) {
                mais16Faltas++;
            }
        }

        if (aprovados > 0) {
            double mediaAprovados = somaNotasAprovados / aprovados;
            System.out.println("\nMédia das notas dos aprovados = " + mediaAprovados);
        } else {
            System.out.println("\nNenhum aluno aprovado.");
        }
        System.out.println("Quantidade de alunos com mais de 16 faltas = " + mais16Faltas);

        teclado.close();
    }
}
