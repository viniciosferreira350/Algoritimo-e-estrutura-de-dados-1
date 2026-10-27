// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_11c;

public class Exercicio11c {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = (2.0 * aux + 1.0) * Math.sqrt(4.0 * aux + 1.0);
            double den = Math.pow(5.0, aux);
            soma += num / den;
        }
        double serie = Math.pow(soma, 2);
        System.out.println("C = " + serie);
    }
}
