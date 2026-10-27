// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_07;

public class Exercicio07 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 6; aux++) {
            double num = 2.0 * (aux - 1) + 3.0 * aux;
            double den = 6.0 * aux + 1.0;
            serie += num / den;
        }
        System.out.println("Valor da Série = " + serie);
    }
}
