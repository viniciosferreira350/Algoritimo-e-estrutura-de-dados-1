package conteudo_08.exercicio_11;

import java.awt.GraphicsEnvironment;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int totalPessoas = 50;
        int mulheresFiltro = 0;
        double maiorSalario = -1, maiorSalarioHomens = -1, menorSalarioHomens = Double.MAX_VALUE;
        String nomeMaiorSalario = "";
        boolean temHomem = false;

        boolean headless = GraphicsEnvironment.isHeadless();
        Scanner teclado = new Scanner(System.in);

        if (!headless) {
            String strQtd = JOptionPane.showInputDialog(null, "Quantas pessoas deseja cadastrar (padrão 50, digite <= 0 para 50):");
            if (strQtd != null && !strQtd.trim().isEmpty()) {
                int q = Integer.parseInt(strQtd.trim());
                if (q > 0) totalPessoas = q;
            }
        } else {
            System.out.print("Quantas pessoas deseja cadastrar (padrão 50, digite <= 0 para 50): ");
            int q = teclado.nextInt();
            teclado.nextLine();
            if (q > 0) totalPessoas = q;
        }

        for (int aux = 1; aux <= totalPessoas; aux++) {
            String nome, sexo, estCivil, corOlhos, corCabelo;
            int idade, escolaridade;
            double salario;

            if (!headless) {
                nome = JOptionPane.showInputDialog("Pessoa " + aux + " - Nome:");
                if (nome == null || nome.trim().isEmpty()) break;

                idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                String[] sexos = {"Masculino", "Feminino"};
                int optSexo = JOptionPane.showOptionDialog(null, "Sexo:", "Sexo", 0, JOptionPane.QUESTION_MESSAGE, null, sexos, sexos[0]);
                sexo = (optSexo == 1) ? "F" : "M";

                String[] civis = {"Casado", "Solteiro", "Outros"};
                int optCivil = JOptionPane.showOptionDialog(null, "Estado Civil:", "Estado Civil", 0, JOptionPane.QUESTION_MESSAGE, null, civis, civis[0]);
                estCivil = (optCivil == 0) ? "C" : (optCivil == 1) ? "S" : "O";

                String[] olhos = {"Azul", "Castanhos", "Preto", "Outros"};
                int optOlhos = JOptionPane.showOptionDialog(null, "Cor dos olhos:", "Olhos", 0, JOptionPane.QUESTION_MESSAGE, null, olhos, olhos[0]);
                corOlhos = (optOlhos == 0) ? "A" : (optOlhos == 1) ? "C" : (optOlhos == 2) ? "P" : "O";

                String[] cabelos = {"Loiro", "Preto", "Castanhos", "Ruivo"};
                int optCab = JOptionPane.showOptionDialog(null, "Cor dos cabelos:", "Cabelos", 0, JOptionPane.QUESTION_MESSAGE, null, cabelos, cabelos[0]);
                corCabelo = (optCab == 0) ? "L" : (optCab == 1) ? "P" : (optCab == 2) ? "C" : "R";

                salario = Double.parseDouble(JOptionPane.showInputDialog("Salário (R$):"));
                String[] escol = {"1-Analfabeto", "2-Ensino Fundamental", "3-Ensino Médio", "4-Superior"};
                int optEsc = JOptionPane.showOptionDialog(null, "Escolaridade:", "Escolaridade", 0, JOptionPane.QUESTION_MESSAGE, null, escol, escol[0]);
                escolaridade = optEsc + 1;

            } else {
                System.out.print("Pessoa " + aux + " - Nome (ou FIM): ");
                nome = teclado.nextLine();
                if (nome.equalsIgnoreCase("FIM") || nome.trim().isEmpty()) break;
                System.out.print("Idade: ");
                idade = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Sexo (M/F): ");
                sexo = teclado.nextLine().toUpperCase();
                System.out.print("Estado Civil (C/S/O): ");
                estCivil = teclado.nextLine().toUpperCase();
                System.out.print("Cor dos Olhos (A/C/P/O): ");
                corOlhos = teclado.nextLine().toUpperCase();
                System.out.print("Cor dos Cabelos (L/P/C/R): ");
                corCabelo = teclado.nextLine().toUpperCase();
                System.out.print("Salário: ");
                salario = teclado.nextDouble();
                System.out.print("Escolaridade (1-Analfabeto, 2-Fundamental, 3-Médio, 4-Superior): ");
                escolaridade = teclado.nextInt();
                teclado.nextLine();
            }

            if (sexo.equalsIgnoreCase("F") && corCabelo.equalsIgnoreCase("L") && corOlhos.equalsIgnoreCase("A")
                    && idade >= 18 && idade <= 25 && estCivil.equalsIgnoreCase("S")
                    && salario > 10000.00 && escolaridade == 4) {
                mulheresFiltro++;
            }

            if (aux == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            if (sexo.equalsIgnoreCase("M")) {
                if (!temHomem || salario > maiorSalarioHomens) {
                    maiorSalarioHomens = salario;
                }
                if (!temHomem || salario < menorSalarioHomens) {
                    menorSalarioHomens = salario;
                }
                temHomem = true;
            }
        }

        String resultado = "Quantidade de mulheres loiras, olhos azuis, 18-25 anos, solteiras, salario > 10k e curso superior = " + mulheresFiltro + "\n";
        resultado += "Nome da pessoa com maior salário = " + nomeMaiorSalario + " (R$ " + maiorSalario + ")\n";
        if (temHomem) {
            double dif = maiorSalarioHomens - menorSalarioHomens;
            resultado += "Diferença entre o maior e menor salário dos homens = R$ " + dif;
        } else {
            resultado += "Nenhum homem pesquisado.";
        }

        if (!headless) {
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            System.out.println("\n" + resultado);
            teclado.close();
        }
    }
}
