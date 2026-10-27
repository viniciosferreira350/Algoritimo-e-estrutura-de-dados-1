// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_10a;

public class Exercicio10a {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += aux / Math.sqrt(2.0 * aux);
        }
        System.out.println("A = " + serie);
    }
}
