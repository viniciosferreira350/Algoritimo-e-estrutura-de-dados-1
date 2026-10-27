// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_11.exercicio_13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int termos, aux = 1;
        double soma = 0, serie;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();

        while (aux <= termos) {
            double base = 10.0 + 9.0 * (aux - 1);
            double exp = 2.0 * aux;
            double num = aux * Math.pow(base, exp);
            double den = Math.pow(7.0, aux - 1);
            soma += num / den;
            aux++;
        }

        serie = 71.0 + Math.cbrt(soma);
        System.out.println("Valor da Série = " + serie);

        teclado.close();
    }
}
