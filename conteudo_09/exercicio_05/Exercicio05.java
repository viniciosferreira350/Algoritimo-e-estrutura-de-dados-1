package conteudo_09.exercicio_05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int termos;
        double soma = 0, serie;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            double num = 2.0 * (aux - 1) + 3.0 * aux;
            double den = 6.0 * aux + 1.0;
            soma += num / den;
        }

        serie = 5.0 * soma;
        System.out.println("Valor da Série = " + serie);
        teclado.close();
    }
}
