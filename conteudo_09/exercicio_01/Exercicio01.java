package conteudo_09.exercicio_01;

public class Exercicio01 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 37; aux++) {
            double num = (38.0 - aux) * (39.0 - aux);
            double den = aux;
            serie += num / den;
        }
        System.out.println("Valor da Série = " + serie);
    }
}
