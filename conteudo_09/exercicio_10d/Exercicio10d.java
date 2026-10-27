// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_10d;

public class Exercicio10d {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = aux + (aux - 1);
            double den = Math.pow(aux, 2);
            serie += num / den;
        }
        System.out.println("D = " + serie);
    }
}
