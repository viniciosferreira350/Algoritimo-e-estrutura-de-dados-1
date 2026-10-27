// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int n;
        String simbolo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número n (entre 1 e 20): ");
        n = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Informe o símbolo: ");
        simbolo = teclado.nextLine();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
