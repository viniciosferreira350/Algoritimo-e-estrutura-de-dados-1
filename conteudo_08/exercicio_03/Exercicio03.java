// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double nota;
        int faltas, aprovados = 0, reprovados = 0;
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
                aprovados++;
            } else {
                System.out.println("ALUNO REPROVADO");
                reprovados++;
            }
        }

        System.out.println("\nAprovados -> " + aprovados);
        System.out.println("Reprovados -> " + reprovados);
        teclado.close();
    }
}
