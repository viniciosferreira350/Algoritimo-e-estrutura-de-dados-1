package conteudo_08.exercicio_22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        int numero, divisores = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro maior que zero: ");
        numero = teclado.nextInt();

        for (int aux = 1; aux <= numero; aux++) {
            if (numero % aux == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println(numero + " é PRIMO");
        } else {
            System.out.println(numero + " NÃO é primo");
        }

        teclado.close();
    }
}
