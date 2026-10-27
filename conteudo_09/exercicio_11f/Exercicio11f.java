package conteudo_09.exercicio_11f;

public class Exercicio11f {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = (2.0 * aux - 1.0) * Math.pow(2.0, aux + 1);
            double den = Math.pow(5.0 * aux - 3.0, 2);
            soma += num / den;
        }
        double serie = 5.0 * Math.sqrt(soma);
        System.out.println("F = " + serie);
    }
}
