package conteudo_11.exercicio_10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro entre 1 e 9: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("DH ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
