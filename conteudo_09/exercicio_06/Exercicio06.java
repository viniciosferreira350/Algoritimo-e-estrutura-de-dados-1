package conteudo_09.exercicio_06;

public class Exercicio06 {
    public static void main(String[] args) {
        double soma = 0, serie;
        for (int aux = 1; aux <= 20; aux++) {
            double num = aux;
            double den = Math.sqrt(2.0 * aux);
            soma += num / den;
        }
        serie = 10.0 + soma;
        System.out.println("Valor da Série = " + serie);
    }
}
