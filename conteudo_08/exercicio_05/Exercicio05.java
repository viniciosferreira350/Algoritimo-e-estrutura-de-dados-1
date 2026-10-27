// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int voto, votosFulano = 0, votosCiclano = 0, votosBeltrano = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Eleição para Prefeito: 1-Fulano, 2-Ciclano, 3-Beltrano (digite 0 para encerrar antecipadamente):");
        for (int aux = 1; aux <= 100; aux++) {
            System.out.print("Eleitor " + aux + " - Informe seu voto: ");
            voto = teclado.nextInt();
            if (voto == 0) {
                break;
            }

            if (voto == 1) {
                votosFulano++;
            } else if (voto == 2) {
                votosCiclano++;
            } else if (voto == 3) {
                votosBeltrano++;
            }
        }

        System.out.println("\nResultado da Eleição:");
        System.out.println("Fulano: " + votosFulano + " votos");
        System.out.println("Ciclano: " + votosCiclano + " votos");
        System.out.println("Beltrano: " + votosBeltrano + " votos");

        if (votosFulano > votosCiclano && votosFulano > votosBeltrano) {
            System.out.println("Vencedor: Fulano");
        } else if (votosCiclano > votosFulano && votosCiclano > votosBeltrano) {
            System.out.println("Vencedor: Ciclano");
        } else if (votosBeltrano > votosFulano && votosBeltrano > votosCiclano) {
            System.out.println("Vencedor: Beltrano");
        }

        teclado.close();
    }
}
