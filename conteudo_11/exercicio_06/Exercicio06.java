package conteudo_11.exercicio_06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int casasVisitadas = 0, casasValidas = 0;
        int aud4 = 0, aud7 = 0, aud12 = 0;
        int canal, pessoas;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Pesquisa de audiência em 100 casas (digite canal -1 para encerrar antecipadamente):");

        while (casasVisitadas < 100) {
            casasVisitadas++;
            System.out.print("Casa " + casasVisitadas + " - Informe o canal (4, 7, 12 ou 0 se desligada): ");
            canal = teclado.nextInt();
            if (canal == -1) {
                break;
            }

            if (canal == 4 || canal == 7 || canal == 12) {
                System.out.print("Informe o número de pessoas assistindo: ");
                pessoas = teclado.nextInt();

                casasValidas++;
                if (canal == 4) {
                    aud4 += pessoas;
                } else if (canal == 7) {
                    aud7 += pessoas;
                } else {
                    aud12 += pessoas;
                }
            } else {
                System.out.println("Casa ignorada (TV desligada ou canal fora da pesquisa).");
            }
        }

        int totalPessoas = aud4 + aud7 + aud12;
        System.out.println("\nAudiência total Canal 4 = " + aud4);
        System.out.println("Audiência total Canal 7 = " + aud7);
        System.out.println("Audiência total Canal 12 = " + aud12);

        if (totalPessoas > 0) {
            System.out.printf("Porcentagem Canal 4 = %.2f%%\n", (aud4 * 100.0 / totalPessoas));
            System.out.printf("Porcentagem Canal 7 = %.2f%%\n", (aud7 * 100.0 / totalPessoas));
            System.out.printf("Porcentagem Canal 12 = %.2f%%\n", (aud12 * 100.0 / totalPessoas));

            int maisAssistido = 4;
            int maiorAud = aud4;
            if (aud7 > maiorAud) {
                maiorAud = aud7;
                maisAssistido = 7;
            }
            if (aud12 > maiorAud) {
                maiorAud = aud12;
                maisAssistido = 12;
            }
            System.out.println("Canal mais assistido = Canal " + maisAssistido);
        }

        if (casasValidas > 0) {
            double media = (double) totalPessoas / casasValidas;
            System.out.printf("Média de pessoas assistindo TV = %.2f por casa válida\n", media);
        }

        teclado.close();
    }
}
