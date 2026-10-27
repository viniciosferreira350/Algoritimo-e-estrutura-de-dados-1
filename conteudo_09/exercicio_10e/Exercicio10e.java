// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_10e;

public class Exercicio10e {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += aux / (3.0 * 2.0 * aux);
        }
        System.out.println("E = " + serie);
    }
}
