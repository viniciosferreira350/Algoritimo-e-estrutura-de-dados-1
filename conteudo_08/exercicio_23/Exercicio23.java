// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_23;

public class Exercicio23 {
    public static void main(String[] args) {
        int soma = 0, cont = 0;

        for (int aux = 1000; aux <= 9999; aux++) {
            int milhar = aux / 1000;
            int centena = (aux / 100) % 10;
            int dezena = (aux / 10) % 10;
            int unidade = aux % 10;

            if (milhar == unidade && centena == dezena) {
                System.out.print(aux + " ");
                soma += aux;
                cont++;
            }
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.println("\n\nQuantidade de palíndromos = " + cont);
            System.out.println("Média = " + media);
        }
    }
}
