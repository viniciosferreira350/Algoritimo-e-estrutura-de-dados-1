// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_10.exercicio_07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double populacao, infectados = 1.0;
        int dias = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a população total da região: ");
        populacao = teclado.nextDouble();

        do {
            infectados += infectados * 0.003;
            dias++;
        } while (infectados < populacao);

        int anos = dias / 365;
        int resto = dias % 365;
        int meses = resto / 30;
        int diasResto = resto % 30;

        System.out.println("Anos = " + anos + "     Meses = " + meses + "   Dias = " + diasResto);
        teclado.close();
    }
}
