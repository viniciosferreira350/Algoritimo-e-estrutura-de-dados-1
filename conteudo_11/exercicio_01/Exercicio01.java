package conteudo_11.exercicio_01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int n, x = 1, cont = 0;
        double fx, somaFx = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor final de x: ");
        n = teclado.nextInt();

        while (x <= n) {
            fx = Math.pow(x, 2) + (4.0 * x - 2.0) / 5.0;
            System.out.println("x=" + x + "\tf(x)=" + fx);
            somaFx += fx;
            cont++;
            x += 2;
        }

        if (cont > 0) {
            double media = somaFx / cont;
            System.out.println("Média de f(x) = " + media + " -> (" + somaFx + " / " + cont + ")");
        }

        teclado.close();
    }
}
