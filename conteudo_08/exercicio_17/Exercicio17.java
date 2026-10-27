// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_17;

public class Exercicio17 {
    public static void main(String[] args) {
        for (int x = 3; x <= 12; x++) {
            double fx = Math.sqrt(Math.pow(x, 2) - 3.0);
            System.out.printf("x=%d     f(x)=%.4f\n", x, fx);
        }
    }
}
