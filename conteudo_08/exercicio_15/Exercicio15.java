// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        String nome, cargo, nomeMaior = "", cargoMaior = "";
        double salario, somaSalariosAte18 = 0, maiorSalario = -1;
        int idade, contAte18 = 0, totalFunc = 1000;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja informar (padrão 1000, <= 0 para 1000): ");
        int limite = teclado.nextInt();
        teclado.nextLine();
        if (limite > 0) totalFunc = limite;

        for (int aux = 1; aux <= totalFunc; aux++) {
            System.out.print("Nome do funcionário (ou FIM): ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM") || nome.trim().isEmpty()) {
                break;
            }
            System.out.print("Cargo: ");
            cargo = teclado.nextLine();
            System.out.print("Salário: ");
            salario = teclado.nextDouble();
            System.out.print("Idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            if (salario > 10000.00 && idade > 50) {
                System.out.println(nome + " é SÊNIOR");
            }

            if (idade <= 18) {
                somaSalariosAte18 += salario;
                contAte18++;
            }

            if (aux == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }

        if (contAte18 > 0) {
            double media = somaSalariosAte18 / contAte18;
            System.out.printf("\nA média dos salários dos funcionários com até 18 anos = R$ %.2f\n", media);
        }
        System.out.printf("O nome e o cargo do funcionário que tem o maior salário = %s - %s\n", nomeMaior, cargoMaior);

        teclado.close();
    }
}
