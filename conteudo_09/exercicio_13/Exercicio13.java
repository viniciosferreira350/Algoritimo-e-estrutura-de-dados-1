// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_13;

public class Exercicio13 {
    public static void main(String[] args) {
        double serie = 0;
        double fatorial = 1.0;

        for (int aux = 1; aux <= 10; aux++) {
            fatorial *= aux;
            double den = Math.pow(2.0, aux) - 1.0;
            double termo = fatorial / den;

            if (aux % 2 == 1) {
                serie += termo;
            } else {
                serie -= termo;
            }
        }

        System.out.println("Valor da Série = " + serie);
    }
}
