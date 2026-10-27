package conteudo_10.exercicio_05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double altura, peso, somaAltHomens = 0;
        String sexo;
        int totalPesquisados = 0, totalMulheres = 0, totalHomens = 0, mulheresMenor60 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para finalizar digite 0 na altura (flag)");
        do {
            System.out.print("Informe a altura (em metros): ");
            altura = teclado.nextDouble();
            if (altura != 0) {
                System.out.print("Informe o peso (em kg): ");
                peso = teclado.nextDouble();
                teclado.nextLine();

                do {
                    System.out.print("Informe o sexo (M ou F): ");
                    sexo = teclado.nextLine();
                    if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                        System.out.println("Código inválido! Informe novamente.");
                    }
                } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));

                totalPesquisados++;
                if (sexo.equalsIgnoreCase("F")) {
                    totalMulheres++;
                    if (peso < 60.0) {
                        mulheresMenor60++;
                    }
                } else {
                    totalHomens++;
                    somaAltHomens += altura;
                }
            }
        } while (altura != 0);

        System.out.println("Total de pessoas pesquisadas = " + totalPesquisados);
        System.out.println("Quantidade de mulheres = " + totalMulheres);
        if (totalHomens > 0) {
            double altMediaHomens = somaAltHomens / totalHomens;
            System.out.println("Altura média dos homens = " + altMediaHomens);
        } else {
            System.out.println("Nenhum homem pesquisado.");
        }
        System.out.println("Quantidade de mulheres com peso inferior a 60 = " + mulheresMenor60);

        teclado.close();
    }
}
