package conteudo_11.exercicio_11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro entre 1 e 9: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
