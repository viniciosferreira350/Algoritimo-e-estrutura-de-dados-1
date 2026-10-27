// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero, somaDiv4 = 0, contDiv3 = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe o número " + aux + ": ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é PAR");
            } else {
                System.out.println(numero + " é ÍMPAR");
            }

            if (numero % 4 == 0) {
                somaDiv4 += numero;
            }

            if (numero % 3 == 0) {
                contDiv3++;
            }
        }

        System.out.println("\nSoma dos números divisíveis por 4 = " + somaDiv4);
        System.out.println("Quantidade de números divisíveis por 3 = " + contDiv3);

        teclado.close();
    }
}
