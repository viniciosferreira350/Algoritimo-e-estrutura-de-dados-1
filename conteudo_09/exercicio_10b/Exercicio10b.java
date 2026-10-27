package conteudo_09.exercicio_10b;

public class Exercicio10b {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            soma += (2.0 * aux) / (3.0 * aux);
        }
        double serie = 1.0 + Math.sqrt(soma);
        System.out.println("B = " + serie);
    }
}
