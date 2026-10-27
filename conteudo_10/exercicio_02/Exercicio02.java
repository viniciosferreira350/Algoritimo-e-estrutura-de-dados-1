package conteudo_10.exercicio_02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double valor, total = 0;
        int cont = 0, acimaMil = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para finalizar digite 0");
        do {
            System.out.print("Informe o valor recebido pelo serviço: ");
            valor = teclado.nextDouble();
            if (valor != 0) {
                total += valor;
                cont++;
                if (valor > 1000.00) {
                    acimaMil++;
                }
            }
        } while (valor != 0);

        if (cont > 0) {
            double media = total / cont;
            System.out.printf("Valor total recebido = %.2f\n", total);
            System.out.printf("Média dos valores recebidos = %.2f\n", media);
            System.out.println("Quantidade de valores acima de R$1000.00 = " + acimaMil);
        } else {
            System.out.println("Nenhum valor informado.");
        }

        teclado.close();
    }
}
