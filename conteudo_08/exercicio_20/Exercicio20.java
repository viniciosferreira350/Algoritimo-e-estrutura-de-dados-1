package conteudo_08.exercicio_20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int n;
        double soma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos n: ");
        n = teclado.nextInt();

        for (int aux = 1; aux <= n; aux++) {
            double termo = Math.pow(2.0, aux - 1);
            System.out.print((long)termo + " ");
            soma += termo;
        }

        System.out.println("\n\nSoma dos " + n + " primeiros termos: " + soma);
        teclado.close();
    }
}
