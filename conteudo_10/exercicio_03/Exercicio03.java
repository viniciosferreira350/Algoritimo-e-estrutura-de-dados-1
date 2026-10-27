// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_10.exercicio_03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double alpha, r, s;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do ângulo alpha: ");
        alpha = teclado.nextDouble();

        System.out.println("Para finalizar digite -1 no raio");
        do {
            System.out.print("Informe o valor do raio R: ");
            r = teclado.nextDouble();
            if (r != -1) {
                s = (alpha * 3.1416 * Math.pow(r, 2)) / 360.0;
                System.out.println("S = " + s);
            }
        } while (r != -1);

        teclado.close();
    }
}
