// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_10c;

public class Exercicio10c {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            soma += (2.0 * aux - 1.0) / (2.0 * aux);
        }
        double serie = (1.0 / 3.0) * Math.pow(soma, 2);
        System.out.println("C = " + serie);
    }
}
