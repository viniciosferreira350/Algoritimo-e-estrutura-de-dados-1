// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_10.exercicio_01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double valor, multa, somaMultas = 0;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para finalizar digite -1");
        do {
            System.out.print("Informe o valor financeiro: ");
            valor = teclado.nextDouble();
            if (valor != -1) {
                multa = valor * 0.10;
                System.out.printf("Multa = %.2f\n", multa);
                somaMultas += multa;
                cont++;
            }
        } while (valor != -1);

        if (cont > 0) {
            double media = somaMultas / cont;
            System.out.printf("Média = %.2f\n", media);
        } else {
            System.out.println("Nenhum valor foi informado.");
        }

        teclado.close();
    }
}
