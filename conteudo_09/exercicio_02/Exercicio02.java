// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_09.exercicio_02;

public class Exercicio02 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = aux;
            double den = Math.pow(aux, 2) + (aux - 1);
            serie += num / den;
        }
        System.out.println("Valor da Série = " + serie);
    }
}


//aux * variação
//alguma coisa elevada a aux
// aux elevado há alguma potencia

//somatorio dentro de if
//impressão dentro e fora da estrutura de rep
//joptionpane
//series
//entender o problema
//