// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro de 1 a 9: ");
        num = teclado.nextInt();

        for (int aux = 1; aux <= 9; aux++) {
            System.out.println(aux + " x " + num + " = " + (aux * num));
        }

        teclado.close();
    }
}
