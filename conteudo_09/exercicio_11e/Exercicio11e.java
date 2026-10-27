// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_11e;

public class Exercicio11e {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = Math.pow(aux, 2) * Math.sqrt(2.0 * aux + 3.0);
            double den = Math.pow(aux + 1.0, aux);
            soma += num / den;
        }
        double serie = (2.0 / 3.0) * soma;
        System.out.println("E = " + serie);
    }
}
