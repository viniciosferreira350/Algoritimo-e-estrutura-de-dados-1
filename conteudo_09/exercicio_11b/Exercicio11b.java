// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_11b;

public class Exercicio11b {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = 3.0 * aux - 2.0;
            double den = Math.sqrt(3.0 * aux + 4.0);
            soma += num / den;
        }
        double serie = (5.0 / 3.0) * soma;
        System.out.println("B = " + serie);
    }
}
