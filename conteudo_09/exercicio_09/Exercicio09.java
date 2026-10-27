// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int termos;
        double soma = 0, serie;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            double num = Math.pow(3.0, aux + 1);
            double den = (aux + 9.0) * Math.pow(aux, 2);
            soma += num / den;
        }

        serie = 100.0 - Math.pow(soma, 3);
        System.out.println("Valor da Série = " + serie);
        teclado.close();
    }
}
