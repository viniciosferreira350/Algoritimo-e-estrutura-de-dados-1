package conteudo_09.exercicio_08;

public class Exercicio08 {
    public static void main(String[] args) {
        double soma = 0, serie;
        for (int aux = 1; aux <= 20; aux++) {
            double num = (2.0 * aux + 1.0) * Math.sqrt(4.0 * aux + 1.0);
            double den = Math.pow(5.0, aux);
            soma += num / den;
        }
        serie = Math.pow(soma, 2);
        System.out.println("Valor da Série = " + serie);
    }
}
