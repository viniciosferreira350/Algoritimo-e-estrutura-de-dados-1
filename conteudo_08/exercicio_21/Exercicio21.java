package conteudo_08.exercicio_21;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        double altura;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a sua altura em metros: ");
        altura = teclado.nextDouble();

        System.out.printf("%-10s %-15s %-20s\n", "Peso", "IMC", "Situação Corpórea");
        System.out.println("---------------------------------------------");

        for (int peso = 60; peso <= 100; peso++) {
            double imc = peso / Math.pow(altura, 2);
            String situacao;

            if (imc < 20.0) {
                situacao = "ABAIXO DO PESO";
            } else if (imc <= 25.0) {
                situacao = "PESO IDEAL";
            } else {
                situacao = "ACIMA DO PESO";
            }

            System.out.printf("%-10d %-15.2f %-20s\n", peso, imc, situacao);
        }

        teclado.close();
    }
}
