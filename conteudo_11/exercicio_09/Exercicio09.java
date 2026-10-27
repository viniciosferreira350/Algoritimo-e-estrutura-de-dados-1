package conteudo_11.exercicio_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        String nome, rf, nomeMaisAntigo = "", nomeMaisNovo = "";
        int setor1 = 0, setor2 = 0, setor3 = 0, setor4 = 0;
        int adm2010 = 0, totalValidos = 0;
        int menorOrdemGeral = Integer.MAX_VALUE, maiorOrdemGeral = Integer.MIN_VALUE;
        Scanner teclado;

        File f = new File("funcionarios.txt");
        if (f.exists()) {
            try {
                teclado = new Scanner(f);
                System.out.println("Lendo do arquivo funcionarios.txt...");
            } catch (FileNotFoundException e) {
                teclado = new Scanner(System.in);
            }
        } else {
            teclado = new Scanner(System.in);
        }

        System.out.println("Para encerrar digite FIM no nome");
        System.out.print("Informe o nome do funcionário: ");
        nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Informe o registro funcional (RF): ");
            rf = teclado.nextLine().trim();

            boolean valido = true;
            if (rf.length() != 6) {
                valido = false;
            } else {
                int ano = Integer.parseInt(rf.substring(0, 2));
                int setor = Integer.parseInt(rf.substring(2, 3));
                if (ano < 10 || ano > 14) {
                    valido = false;
                } else if (setor < 1 || setor > 4) {
                    valido = false;
                }
            }

            if (!valido) {
                System.out.println(rf + " = Registro inválido");
            } else {
                int ano = Integer.parseInt(rf.substring(0, 2));
                int setor = Integer.parseInt(rf.substring(2, 3));
                int ordem = Integer.parseInt(rf.substring(3, 6));
                int ordemGeral = ano * 1000 + ordem;

                if (setor == 1) setor1++;
                else if (setor == 2) setor2++;
                else if (setor == 3) setor3++;
                else if (setor == 4) setor4++;

                if (ano == 10 && setor == 2) {
                    adm2010++;
                }

                if (totalValidos == 0 || ordemGeral < menorOrdemGeral) {
                    menorOrdemGeral = ordemGeral;
                    nomeMaisAntigo = nome;
                }

                if (totalValidos == 0 || ordemGeral > maiorOrdemGeral) {
                    maiorOrdemGeral = ordemGeral;
                    nomeMaisNovo = nome;
                }

                totalValidos++;
            }

            System.out.print("Informe o nome do funcionário: ");
            if (teclado.hasNextLine()) {
                nome = teclado.nextLine();
            } else {
                break;
            }
        }

        System.out.println("\nFuncionários por setor:");
        System.out.println("Gerência = " + setor1);
        System.out.println("Administração = " + setor2);
        System.out.println("Pesquisa = " + setor3);
        System.out.println("Obras = " + setor4);
        System.out.println("Entraram em 2010 na Administração = " + adm2010);

        String setorMais = "Gerência";
        int maxSetor = setor1;
        if (setor2 > maxSetor) { maxSetor = setor2; setorMais = "Administração"; }
        if (setor3 > maxSetor) { maxSetor = setor3; setorMais = "Pesquisa"; }
        if (setor4 > maxSetor) { maxSetor = setor4; setorMais = "Obras"; }

        System.out.println("Setor que tem mais funcionários = " + setorMais);
        System.out.println("Funcionário mais antigo = " + nomeMaisAntigo);
        System.out.println("Funcionário mais novo = " + nomeMaisNovo);

        teclado.close();
    }
}
