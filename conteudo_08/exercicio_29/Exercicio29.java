// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int x, y;
        long potencia = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a base X (positivo): ");
        x = teclado.nextInt();
        System.out.print("Informe o expoente Y (positivo): ");
        y = teclado.nextInt();

        for (int aux = 1; aux <= y; aux++) {
            potencia *= x;
        }

        System.out.println(x + "^" + y + " = " + potencia);
        teclado.close();
    }
}
