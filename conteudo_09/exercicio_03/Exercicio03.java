// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int termos;
        double serie = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            double num = 1.0 + Math.sqrt(4.0 * aux);
            double den = 3.0 * aux;
            serie += num / den;
        }

        System.out.println("Valor da Série = " + serie);
        teclado.close();
    }
}
