// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_11d;

public class Exercicio11d {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += Math.pow(aux, 3) / Math.pow(10.0, aux - 1);
        }
        System.out.println("D = " + serie);
    }
}
