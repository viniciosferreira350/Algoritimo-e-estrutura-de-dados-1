// Matrícula: D31279
// Nome: Vinicios Ferreira da Silva

package conteudo_08.exercicio_05a;

import java.util.Scanner;

public class Exercicio05a {
    public static void main(String[] args) {
        int voto, votosFulano = 0, votosCiclano = 0, votosBeltrano = 0, votosNulos = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Eleição (1-Fulano, 2-Ciclano, 3-Beltrano, outros = Nulo, 0 para encerrar antecipadamente):");
        for (int aux = 1; aux <= 100; aux++) {
            System.out.print("Eleitor " + aux + " - Voto: ");
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
            } else {
                votosNulos++;
            }
        }

        int votosValidos = votosFulano + votosCiclano + votosBeltrano;
        System.out.println("\nApuração 1º Turno:");
        System.out.println("Fulano: " + votosFulano);
        System.out.println("Ciclano: " + votosCiclano);
        System.out.println("Beltrano: " + votosBeltrano);
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos Válidos: " + votosValidos);

        if (votosNulos > votosValidos) {
            System.out.println("A eleição está ANULADA pois os votos nulos superaram os votos válidos.");
            teclado.close();
            return;
        }

        int maiorVotos = Math.max(votosFulano, Math.max(votosCiclano, votosBeltrano));
        int empatados = 0;
        boolean empateFulano = (votosFulano == maiorVotos);
        boolean empateCiclano = (votosCiclano == maiorVotos);
        boolean empateBeltrano = (votosBeltrano == maiorVotos);

        if (empateFulano) empatados++;
        if (empateCiclano) empatados++;
        if (empateBeltrano) empatados++;

        if (empatados == 1) {
            if (empateFulano) System.out.println("Vencedor da Eleição: Fulano");
            else if (empateCiclano) System.out.println("Vencedor da Eleição: Ciclano");
            else System.out.println("Vencedor da Eleição: Beltrano");
        } else {
            System.out.println("\nHOUVE EMPATE! Iniciando SEGUNDO TURNO...");
            int v2Fulano = 0, v2Ciclano = 0, v2Beltrano = 0, v2Nulos = 0;
            System.out.print("Informe a quantidade de eleitores do segundo turno (ex: 10): ");
            int eleitores2 = teclado.nextInt();

            for (int aux = 1; aux <= eleitores2; aux++) {
                System.out.print("Eleitor " + aux + " - Voto 2º Turno: ");
                voto = teclado.nextInt();
                if (voto == 1 && empateFulano) {
                    v2Fulano++;
                } else if (voto == 2 && empateCiclano) {
                    v2Ciclano++;
                } else if (voto == 3 && empateBeltrano) {
                    v2Beltrano++;
                } else {
                    v2Nulos++;
                }
            }

            int v2Validos = v2Fulano + v2Ciclano + v2Beltrano;
            System.out.println("\nApuração 2º Turno:");
            if (empateFulano) System.out.println("Fulano: " + v2Fulano);
            if (empateCiclano) System.out.println("Ciclano: " + v2Ciclano);
            if (empateBeltrano) System.out.println("Beltrano: " + v2Beltrano);
            System.out.println("Nulos: " + v2Nulos);

            if (v2Nulos > v2Validos) {
                System.out.println("A eleição de segundo turno está ANULADA!");
            } else {
                int maior2 = Math.max(v2Fulano, Math.max(v2Ciclano, v2Beltrano));
                int emp2 = 0;
                if (empateFulano && v2Fulano == maior2) emp2++;
                if (empateCiclano && v2Ciclano == maior2) emp2++;
                if (empateBeltrano && v2Beltrano == maior2) emp2++;

                if (emp2 == 1) {
                    if (empateFulano && v2Fulano == maior2) System.out.println("Vencedor do 2º Turno: Fulano");
                    else if (empateCiclano && v2Ciclano == maior2) System.out.println("Vencedor do 2º Turno: Ciclano");
                    else System.out.println("Vencedor do 2º Turno: Beltrano");
                } else {
                    System.out.println("Empate persistiu no segundo turno!");
                }
            }
        }

        teclado.close();
    }
}
