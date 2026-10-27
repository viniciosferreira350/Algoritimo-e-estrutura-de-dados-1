// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        int quant, acimaMinimo = 0, adminCount = 0, outrosAcima5000 = 0;
        double somaAdmin = 0, menorSalario = Double.MAX_VALUE;
        String nomeMenor = "", cargoMenor = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de engenheiros pesquisados: ");
        quant = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= quant; aux++) {
            System.out.print("Nome: ");
            String nome = teclado.nextLine();
            System.out.print("Cargo (C, P, O, A, X): ");
            String codCargo = teclado.nextLine().toUpperCase().trim();
            System.out.print("Salário: ");
            double salario = teclado.nextDouble();
            teclado.nextLine();

            double piso = 0;
            String descCargo = "";

            if (codCargo.equals("C")) {
                piso = 2500.00;
                descCargo = "Engenheiro Calculista";
            } else if (codCargo.equals("P")) {
                piso = 4650.00;
                descCargo = "Engenheiro Projetista";
            } else if (codCargo.equals("O")) {
                piso = 3200.00;
                descCargo = "Engenheiro de Obra";
            } else if (codCargo.equals("A")) {
                piso = 5100.00;
                descCargo = "Engenheiro Administrador";
            } else {
                piso = -1;
                descCargo = "Outros";
            }

            if (!codCargo.equals("X")) {
                if (salario < piso) {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                } else {
                    acimaMinimo++;
                }
            }

            if (codCargo.equals("A")) {
                somaAdmin += salario;
                adminCount++;
            }

            if (codCargo.equals("X") && salario > 5000.00) {
                outrosAcima5000++;
            }

            if (aux == 1 || salario < menorSalario) {
                menorSalario = salario;
                nomeMenor = nome;
                cargoMenor = descCargo;
            }
        }

        System.out.println();
        if (adminCount > 0) {
            System.out.printf("Média dos salários dos Administradores = R$ %.2f\n", (somaAdmin / adminCount));
        }
        System.out.println("Quantidade de salários acima do mínimo = " + acimaMinimo);
        System.out.println("Quantidade de engenheiros de cargo Outros que recebem acima de R$5000 = " + outrosAcima5000);
        System.out.printf("Nome, cargo e salário do engenheiro de menor salário = %s, %s, R$ %.2f\n", nomeMenor, cargoMenor, menorSalario);

        teclado.close();
    }
}
