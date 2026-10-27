package conteudo_09.exercicio_10f;

public class Exercicio10f {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += Math.pow(aux, 2) / Math.pow(2.0 * aux, 2);
        }
        System.out.println("F = " + serie);
    }
}
