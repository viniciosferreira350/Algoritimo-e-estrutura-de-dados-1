package conteudo_08.exercicio_02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double nota;
        int faltas;
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
            } else {
                System.out.println("ALUNO REPROVADO");
            }
        }

        teclado.close();
    }
}
