package conteudo_08.exercicio_04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        String nome;
        int idade, ate18 = 0, acima18 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para encerrar digite -1 na idade");
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

            if (idade <= 18) {
                ate18++;
            } else {
                acima18++;
            }
        }

        System.out.println("\nAté 18 -> " + ate18);
        System.out.println("Acima de 18 -> " + acima18);
        teclado.close();
    }
}
