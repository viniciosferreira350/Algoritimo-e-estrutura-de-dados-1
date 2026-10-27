// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int totalCidades = 858, cidadesAcima1M = 0, cidadesMaisMulheres = 0;
        long populacao, eleitores, homens, mulheres, menorPop = Long.MAX_VALUE;
        String nome, cidadeMenorPop = "";
        Scanner teclado;

        File f = new File("cidades.txt");
        if (f.exists()) {
            try {
                teclado = new Scanner(f);
                System.out.println("Lendo do arquivo cidades.txt...");
            } catch (FileNotFoundException e) {
                teclado = new Scanner(System.in);
            }
        } else {
            teclado = new Scanner(System.in);
        }

        System.out.print("Quantas cidades deseja processar (padrão 858, <= 0 para 858): ");
        if (teclado.hasNextInt()) {
            int limite = teclado.nextInt();
            teclado.nextLine();
            if (limite > 0) totalCidades = limite;
        }

        for (int aux = 1; aux <= totalCidades; aux++) {
            if (!teclado.hasNext()) break;
            nome = teclado.next();
            if (!teclado.hasNextLong()) break;
            populacao = teclado.nextLong();
            eleitores = teclado.nextLong();
            homens = teclado.nextLong();
            mulheres = teclado.nextLong();

            if (homens + mulheres != populacao) {
                System.out.println(nome + ": Homens + Mulheres != População");
            }

            double percEleitores = (eleitores * 100.0) / populacao;
            System.out.printf("%s: Percentual de Eleitores = %.1f%%\n", nome, percEleitores);

            if (populacao > 1000000) {
                cidadesAcima1M++;
            }

            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            if (aux == 1 || populacao < menorPop) {
                menorPop = populacao;
                cidadeMenorPop = nome;
            }
        }

        System.out.println("\nTotal de cidades com mais de 1 milhão de habitantes = " + cidadesAcima1M);
        System.out.println("Cidades com mais mulheres que homens = " + cidadesMaisMulheres);
        System.out.println("Cidade com menor população = " + cidadeMenorPop);

        teclado.close();
    }
}
