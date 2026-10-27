// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_30;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        double x, s;
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Informe o valor de n: ");
        n = teclado.nextInt();

        s = Math.log(x);
        for (int aux = 1; aux <= n; aux++) {
            s += Math.pow(x, aux) / aux;
        }

        System.out.println("S = " + s);
        teclado.close();
    }
}
