package conteudo_08.exercicio_07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        String nome;
        int idade, ate12 = 0, acima30 = 0, somaIdades = 0, cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para encerrar antecipadamente digite -1 na idade");
        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe o nome do aluno " + aux + ": ");
            nome = teclado.nextLine();
            if (nome.trim().isEmpty() || nome.equalsIgnoreCase("FIM")) {
                break;
            }
            System.out.print("Informe a idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            if (idade == -1) {
                break;
            }

            if (idade <= 12) {
                ate12++;
            }
            if (idade > 30) {
                acima30++;
            }
            somaIdades += idade;
            cont++;
        }

        if (cont > 0) {
            double media = (double) somaIdades / cont;
            System.out.println("\nAlunos que tem até 12 anos = " + ate12);
            System.out.println("Alunos que tem acima de 30 anos = " + acima30);
            System.out.printf("Média das idades informadas = %.1f\n", media);
        }

        teclado.close();
    }
}
