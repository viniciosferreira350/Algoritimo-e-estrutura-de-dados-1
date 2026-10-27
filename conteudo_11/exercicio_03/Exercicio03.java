package conteudo_11.exercicio_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int dia, pontos, multas8Quinzena1 = 0;
        double valorMulta, totalArrecadado = 0;
        String placa;
        Scanner teclado;

        File arquivo = new File("multas.txt");
        if (arquivo.exists()) {
            try {
                teclado = new Scanner(arquivo);
                System.out.println("Lendo dados do arquivo multas.txt...");
            } catch (FileNotFoundException e) {
                teclado = new Scanner(System.in);
            }
        } else {
            teclado = new Scanner(System.in);
        }

        System.out.println("Para finalizar digite 99 no dia");
        System.out.print("Informe o dia da multa: ");
        dia = teclado.nextInt();

        while (dia != 99) {
            placa = teclado.next();
            pontos = teclado.nextInt();

            if (pontos == 3) {
                valorMulta = 42.00;
            } else if (pontos == 5) {
                valorMulta = 108.00;
            } else if (pontos == 8) {
                valorMulta = 479.00;
            } else {
                valorMulta = 0.0;
            }

            System.out.printf("Placa: %s | Valor da Multa: R$ %.2f\n", placa, valorMulta);
            totalArrecadado += valorMulta;

            if (dia <= 15 && pontos == 8) {
                multas8Quinzena1++;
            }

            System.out.print("Informe o dia da multa: ");
            if (teclado.hasNextInt()) {
                dia = teclado.nextInt();
            } else {
                break;
            }
        }

        System.out.println("\nA quantidade de multas de pontuação 8 da primeira quinzena do mês = " + multas8Quinzena1);
        System.out.printf("O valor total arrecadado com as multas = R$ %.2f\n", totalArrecadado);

        teclado.close();
    }
}
