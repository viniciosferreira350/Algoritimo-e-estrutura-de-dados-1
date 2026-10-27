// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int codigo;
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, q5 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Venda de Equipamentos (1 a 5, digite 0 para encerrar antecipadamente):");
        for (int aux = 1; aux <= 1000; aux++) {
            System.out.print("Venda " + aux + " - Informe o código do modelo (1-A2450, 2-B2356, 3-C3900, 4-D4100, 5-E6749): ");
            codigo = teclado.nextInt();
            if (codigo == 0) {
                break;
            }

            if (codigo == 1) q1++;
            else if (codigo == 2) q2++;
            else if (codigo == 3) q3++;
            else if (codigo == 4) q4++;
            else if (codigo == 5) q5++;
        }

        double faturamento = q1 * 1565.00 + q2 * 1890.00 + q3 * 2150.00 + q4 * 2963.00 + q5 * 3750.00;

        System.out.println("\nResumo das Vendas:");
        System.out.println("Produto 1 = " + q1 + " vendas");
        System.out.println("Produto 2 = " + q2 + " vendas");
        System.out.println("Produto 3 = " + q3 + " vendas");
        System.out.println("Produto 4 = " + q4 + " vendas");
        System.out.println("Produto 5 = " + q5 + " vendas");
        System.out.printf("Faturamento = R$ %.2f\n", faturamento);

        teclado.close();
    }
}
