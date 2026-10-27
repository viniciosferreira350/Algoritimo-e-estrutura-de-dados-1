// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_26;

public class Exercicio26 {
    public static void main(String[] args) {
        for (int rep = 1; rep <= 10; rep++) {
            for (int aux = 1; aux <= 10; aux++) {
                for (int s = 1; s <= aux; s++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int aux = 10; aux >= 1; aux--) {
                for (int s = 1; s <= aux; s++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
