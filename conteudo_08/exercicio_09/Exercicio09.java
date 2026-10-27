package conteudo_08.exercicio_09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int quant, idade, homens = 0, mulheres = 0;
        double somaIdadeHomens = 0, somaIdadeMulheres = 0;
        String nome, sexo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas serão informadas? ");
        quant = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= quant; aux++) {
            System.out.print("Nome: ");
            nome = teclado.nextLine();
            System.out.print("Idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Sexo (M/F): ");
            sexo = teclado.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                somaIdadeHomens += idade;
                homens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                somaIdadeMulheres += idade;
                mulheres++;
            }
        }

        if (homens > 0) {
            System.out.println("Média das idades dos homens = " + (somaIdadeHomens / homens));
        } else {
            System.out.println("Nenhum homem cadastrado.");
        }

        if (mulheres > 0) {
            System.out.println("Média das idades das mulheres = " + (somaIdadeMulheres / mulheres));
        } else {
            System.out.println("Nenhuma mulher cadastrada.");
        }

        teclado.close();
    }
}
