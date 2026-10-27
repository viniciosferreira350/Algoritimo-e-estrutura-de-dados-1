package conteudo_11.exercicio_07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int totalDias = 121, dia = 1, diasMaior = 0;
        double temp, menor = Double.MAX_VALUE, maior = -Double.MAX_VALUE, soma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos dias deseja informar (padrão 121, <=0 para 121): ");
        int limite = teclado.nextInt();
        if (limite > 0) {
            totalDias = limite;
        }

        while (dia <= totalDias) {
            System.out.print("Informe a temperatura do dia " + dia + ": ");
            temp = teclado.nextDouble();

            soma += temp;
            if (dia == 1 || temp < menor) {
                menor = temp;
            }

            if (dia == 1 || temp > maior) {
                maior = temp;
                diasMaior = 1;
            } else if (temp == maior) {
                diasMaior++;
            }

            dia++;
        }

        int contDias = dia - 1;
        if (contDias > 0) {
            double media = soma / contDias;
            System.out.printf("Menor temperatura registrada = %.2f\n", menor);
            System.out.printf("Maior temperatura registrada = %.2f\n", maior);
            System.out.printf("Média das temperaturas registradas = %.2f\n", media);
            System.out.println("Quantidade de dias que ocorreu a maior temperatura = " + diasMaior);
        }

        teclado.close();
    }
}
