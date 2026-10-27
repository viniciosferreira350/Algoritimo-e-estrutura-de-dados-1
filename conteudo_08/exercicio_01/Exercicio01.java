package conteudo_08.exercicio_01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double raio, area;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe o raio do círculo " + aux + " (ou <= 0 para encerrar): ");
            raio = teclado.nextDouble();
            if (raio <= 0) {
                break;
            }
            area = 3.1416 * Math.pow(raio, 2);
            System.out.println("Raio = " + raio + " -> Área = " + area);
        }

        teclado.close();
    }
}
