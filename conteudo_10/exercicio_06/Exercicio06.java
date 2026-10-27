package conteudo_10.exercicio_06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double a, b, c, xo, yo, d;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o coeficiente A da reta: ");
        a = teclado.nextDouble();
        System.out.print("Informe o coeficiente B da reta: ");
        b = teclado.nextDouble();
        System.out.print("Informe o coeficiente C da reta: ");
        c = teclado.nextDouble();

        double pontoCoincidenteX = 0, pontoCoincidenteY = 0;

        do {
            System.out.print("Informe a coordenada Xo do ponto: ");
            xo = teclado.nextDouble();
            System.out.print("Informe a coordenada Yo do ponto: ");
            yo = teclado.nextDouble();

            d = Math.abs(a * xo + b * yo + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("D = " + d);

            if (d == 0) {
                pontoCoincidenteX = xo;
                pontoCoincidenteY = yo;
                break;
            }
        } while (true);

        System.out.println("Ponto coincidente com a reta: (" + pontoCoincidenteX + ", " + pontoCoincidenteY + ")");
        teclado.close();
    }
}
