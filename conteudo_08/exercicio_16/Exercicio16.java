package conteudo_08.exercicio_16;

public class Exercicio16 {
    public static void main(String[] args) {
        int soma = 0, cont = 0;
        for (int aux = 1000; aux <= 2000; aux++) {
            if (aux % 2 != 0) {
                soma += aux;
                cont++;
            }
        }
        double media = (double) soma / cont;
        System.out.println("Média dos números ímpares: " + media);
    }
}
