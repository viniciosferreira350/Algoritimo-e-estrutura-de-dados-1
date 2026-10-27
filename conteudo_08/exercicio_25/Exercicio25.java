package conteudo_08.exercicio_25;

public class Exercicio25 {
    public static void main(String[] args) {
        for (int rep = 1; rep <= 10; rep++) {
            for (int aux = 1; aux <= 10; aux++) {
                for (int j = 1; j <= aux; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int aux = 10; aux >= 1; aux--) {
                for (int j = 1; j <= aux; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
