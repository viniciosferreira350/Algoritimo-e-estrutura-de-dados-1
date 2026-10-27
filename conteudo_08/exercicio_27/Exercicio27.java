// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_27;

public class Exercicio27 {
    public static void main(String[] args) {
        for (int rep = 1; rep <= 10; rep++) {
            for (int p = 0; p <= 7; p++) {
                int estrelas = (int) Math.pow(2, p);
                for (int s = 1; s <= estrelas; s++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int p = 6; p >= 0; p--) {
                int estrelas = (int) Math.pow(2, p);
                for (int s = 1; s <= estrelas; s++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
