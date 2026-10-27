// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int termos;
        double soma = 0, serie;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            double num = (4.0 * aux - 3.0) * (4.0 * aux - 2.0);
            double den = (4.0 * aux - 1.0) * (4.0 * aux);
            soma += num / den;
        }

        serie = Math.sqrt(soma);
        System.out.println("Valor da Série = " + serie);
        teclado.close();
    }
}
