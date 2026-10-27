package conteudo_11.exercicio_14;

public class Exercicio14 {
    public static void main(String[] args) {
        int termos = 0;
        double soma = 0.0, pi = 0.0;

        while (true) {
            termos++;
            double den = 2.0 * termos - 1.0;
            if (termos % 2 == 1) {
                soma += 1.0 / den;
            } else {
                soma -= 1.0 / den;
            }
            pi = 4.0 * soma;
            if (pi >= 3.1416 && pi <= 3.1417) {
                break;
            }
        }

        System.out.println("Valor de PI = " + pi);
        System.out.println("Termos = " + termos);
    }
}
