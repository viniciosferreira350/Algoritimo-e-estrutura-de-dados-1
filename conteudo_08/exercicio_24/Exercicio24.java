package conteudo_08.exercicio_24;

public class Exercicio24 {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 99; aux += 2) {
            soma += Math.pow(2.0, aux);
        }
        double serie = (1.0 / 3.0) * soma;
        System.out.println("Valor da Série = " + serie);
    }
}
