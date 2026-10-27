// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_11a;

public class Exercicio11a {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = aux + (7.0 * aux - 6.0);
            double den = Math.pow(4.0, aux - 1);
            soma += num / den;
        }
        double serie = Math.cbrt(soma);
        System.out.println("A = " + serie);
    }
}
