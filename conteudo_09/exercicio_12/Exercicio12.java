// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_12;

public class Exercicio12 {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 10000; aux++) {
            double termo = 1.0 / (2.0 * aux - 1.0);
            if (aux % 2 == 1) {
                soma += termo;
            } else {
                soma -= termo;
            }
        }
        double pi = 4.0 * soma;
        System.out.println("Valor de PI = " + pi);
    }
}
