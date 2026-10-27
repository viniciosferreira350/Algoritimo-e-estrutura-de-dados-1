package conteudo_08.exercicio_19;

public class Exercicio19 {
    public static void main(String[] args) {
        long soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            long termo = (long) aux * aux;
            System.out.print(termo + " ");
            soma += termo;
        }
        System.out.println("\n\nSoma dos 100 primeiros termos: " + soma);
    }
}
