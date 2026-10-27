package conteudo_08.exercicio_28;

public class Exercicio28 {
    public static void main(String[] args) {
        int soma = 0, cont = 0;

        for (int n = 1; ; n++) {
            int produto = n * (n + 1) * (n + 2);
            if (produto > 1000) {
                break;
            }
            System.out.print(produto + " ");
            soma += produto;
            cont++;
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.println("\n\nMédia = " + media);
        }
    }
}
