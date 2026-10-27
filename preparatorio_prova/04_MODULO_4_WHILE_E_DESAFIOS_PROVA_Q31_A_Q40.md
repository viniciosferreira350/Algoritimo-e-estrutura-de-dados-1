# 🎯 MÓDULO 4: COMANDO `WHILE`, FILTROS COMPLEXOS E DESAFIOS DE PROVA
**Foco:** Conteúdo 11 (Laço `while`, Dupla Leitura, Desafios Integrados de Prova, Estatísticas Avançadas)

---

### 📝 Questão 31: Padrão Clássico de Dupla Leitura no `while`
**Enunciado:** Faça um programa que leia o nome e o salário de vários funcionários. Para encerrar o programa, o usuário digitará `"X"` no nome (flag fictício). Ao final, imprima a média salarial e o nome do funcionário de maior salário.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Regra de Ouro do `while` com Flag Fictício:**
   - 1ª Leitura: ANTES do laço.
   - Condição: `while (!nome.equalsIgnoreCase("X"))`.
   - 2ª Leitura: NO FINAL do bloco interno do laço.

```java
import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, maiorSalario = -1;
        String nomeMaior = "";
        int cont = 0;

        System.out.println("Para encerrar digite X no nome.");
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("X")) {
            System.out.print("Informe o salário: ");
            double salario = teclado.nextDouble();
            teclado.nextLine(); // Limpa buffer

            soma += salario;
            cont++;

            if (cont == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
            }

            // Próxima leitura
            System.out.print("Informe o nome (ou X para sair): ");
            nome = teclado.nextLine();
        }

        if (cont > 0) {
            double media = soma / cont;
            System.out.printf("\nMédia Salarial = R$ %.2f\n", media);
            System.out.printf("Maior Salário: %s com R$ %.2f\n", nomeMaior, maiorSalario);
        } else {
            System.out.println("Nenhum dado informado.");
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 32: Multas de Trânsito por Tabela de Pontos
**Enunciado:** Para cada multa aplicada no mês, solicite o DIA, a PLACA e os PONTOS (3 pontos = R$ 42, 5 pontos = R$ 108, 8 pontos = R$ 479). O programa encerra quando o dia digitado for 99 (flag fictício). Calcule:
- A placa e o valor de cada multa emitida;
- Quantidade de multas de 8 pontos na 1ª quinzena ($dia \le 15$);
- O valor total arrecadado.

```java
import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, pontos, multas8Quinzena1 = 0;
        double valor, total = 0;
        String placa;

        System.out.println("Digite 99 no dia para finalizar.");
        System.out.print("Informe o dia da multa: ");
        dia = teclado.nextInt();

        while (dia != 99) {
            System.out.print("Informe a placa: ");
            placa = teclado.next();
            System.out.print("Informe a pontuação (3, 5 ou 8): ");
            pontos = teclado.nextInt();

            if (pontos == 3) {
                valor = 42.00;
            } else if (pontos == 5) {
                valor = 108.00;
            } else if (pontos == 8) {
                valor = 479.00;
            } else {
                valor = 0.00;
            }

            System.out.printf("Placa: %s | Valor: R$ %.2f\n", placa, valor);
            total += valor;

            if (dia <= 15 && pontos == 8) {
                multas8Quinzena1++;
            }

            System.out.print("\nInforme o dia da multa (99 para sair): ");
            dia = teclado.nextInt();
        }

        System.out.println("\n--- RESUMO DETRAN ---");
        System.out.println("Multas de 8 pontos na 1ª quinzena = " + multas8Quinzena1);
        System.out.printf("Total arrecadado = R$ %.2f\n", total);
        teclado.close();
    }
}
```

---

### 📝 Questão 33: Pesquisa de Audiência de TV com Descarte
**Enunciado:** Uma pesquisa foi feita em 100 residências. Para cada casa era anotado o canal assistido (4, 7 ou 12) e a quantidade de pessoas. Se a TV estivesse desligada (canal 0) ou em outro canal, a casa devia ser **ignorada**. Ao final, imprima a audiência total de cada canal, os percentuais e o canal mais assistido.

```java
import java.util.Scanner;

public class Questao33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aud4 = 0, aud7 = 0, aud12 = 0, casasVisitadas = 0, casasValidas = 0;

        System.out.println("Pesquisa de audiência em 100 residências (ou digite canal -1 para sair):");
        while (casasVisitadas < 100) {
            casasVisitadas++;
            System.out.print("Casa " + casasVisitadas + " - Canal (4, 7, 12 ou 0): ");
            int canal = teclado.nextInt();
            if (canal == -1) break;

            if (canal == 4 || canal == 7 || canal == 12) {
                System.out.print("Quantidade de telespectadores: ");
                int pessoas = teclado.nextInt();
                casasValidas++;

                if (canal == 4) aud4 += pessoas;
                else if (canal == 7) aud7 += pessoas;
                else aud12 += pessoas;
            } else {
                System.out.println("Casa ignorada (fora da pesquisa).");
            }
        }

        int totalPessoas = aud4 + aud7 + aud12;
        System.out.println("\n--- RESULTADO DE AUDIÊNCIA ---");
        System.out.println("Audiência Canal 4 = " + aud4);
        System.out.println("Audiência Canal 7 = " + aud7);
        System.out.println("Audiência Canal 12 = " + aud12);

        if (totalPessoas > 0) {
            System.out.printf("%% Canal 4 = %.2f%%\n", (aud4 * 100.0 / totalPessoas));
            System.out.printf("%% Canal 7 = %.2f%%\n", (aud7 * 100.0 / totalPessoas));
            System.out.printf("%% Canal 12 = %.2f%%\n", (aud12 * 100.0 / totalPessoas));

            int maisAssistido = 4;
            int maxPessoas = aud4;
            if (aud7 > maxPessoas) { maxPessoas = aud7; maisAssistido = 7; }
            if (aud12 > maxPessoas) { maisAssistido = 12; }
            System.out.println("Canal mais assistido = Canal " + maisAssistido);
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 34: Validação de Registro Funcional (RF) de 6 Dígitos
**Enunciado:** O RF de uma empresa tem 6 dígitos:
- 2 primeiros: ano de admissão (deve estar entre 10 e 14, representando 2010 a 2014);
- 3º dígito: setor (1-Gerência, 2-Administração, 3-Pesquisa, 4-Obras);
- 3 últimos: ordem de admissão.
Leia nomes e RFs até o nome `"FIM"`. Valide o código. Se inválido, avise `"REGISTRO INVÁLIDO"`. Ao final, informe a quantidade por setor e o funcionário mais antigo.

```java
import java.util.Scanner;

public class Questao34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int setor1 = 0, setor2 = 0, setor3 = 0, setor4 = 0, validos = 0;
        int menorOrdemGeral = Integer.MAX_VALUE;
        String nomeMaisAntigo = "";

        System.out.print("Nome do funcionário (ou FIM): ");
        String nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Registro Funcional (6 dígitos): ");
            String rf = teclado.nextLine().trim();

            boolean valido = true;
            if (rf.length() != 6) {
                valido = false;
            } else {
                int ano = Integer.parseInt(rf.substring(0, 2));
                int setor = Integer.parseInt(rf.substring(2, 3));
                if (ano < 10 || ano > 14 || setor < 1 || setor > 4) {
                    valido = false;
                }
            }

            if (!valido) {
                System.out.println(rf + " = REGISTRO INVÁLIDO");
            } else {
                int ano = Integer.parseInt(rf.substring(0, 2));
                int setor = Integer.parseInt(rf.substring(2, 3));
                int ordem = Integer.parseInt(rf.substring(3, 6));
                int ordemGeral = ano * 1000 + ordem;

                if (setor == 1) setor1++;
                else if (setor == 2) setor2++;
                else if (setor == 3) setor3++;
                else if (setor == 4) setor4++;

                if (validos == 0 || ordemGeral < menorOrdemGeral) {
                    menorOrdemGeral = ordemGeral;
                    nomeMaisAntigo = nome;
                }
                validos++;
            }

            System.out.print("\nNome do funcionário (ou FIM): ");
            nome = teclado.nextLine();
        }

        System.out.println("\n--- RESUMO DE FUNCIONÁRIOS ---");
        System.out.println("Gerência = " + setor1);
        System.out.println("Administração = " + setor2);
        System.out.println("Pesquisa = " + setor3);
        System.out.println("Obras = " + setor4);
        System.out.println("Funcionário mais antigo = " + nomeMaisAntigo);

        teclado.close();
    }
}
```

---

### 📝 Questão 35: Classificação de Carteira de Investimentos
**Enunciado:** Uma corretora classifica investidores:
- Até R$ 1.000,00: Bronze
- De R$ 1.000,01 a R$ 5.000,00: Prata
- Acima de R$ 5.000,00: Ouro
Leia nome e valor até que o nome seja `"X"`. Ao fim, imprima a quantidade por categoria, a média das aplicações Bronze e o total aplicado.

```java
import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bronze = 0, prata = 0, ouro = 0;
        double somaBronze = 0, volumeTotal = 0;

        System.out.print("Nome do cliente (ou X para sair): ");
        String nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("X")) {
            System.out.print("Valor aplicado (R$): ");
            double valor = teclado.nextDouble();
            teclado.nextLine();

            String categoria;
            if (valor <= 1000.00) {
                categoria = "Bronze";
                bronze++;
                somaBronze += valor;
            } else if (valor <= 5000.00) {
                categoria = "Prata";
                prata++;
            } else {
                categoria = "Ouro";
                ouro++;
            }

            System.out.println("Classificação: " + categoria);
            volumeTotal += valor;

            System.out.print("\nNome do cliente (ou X para sair): ");
            nome = teclado.nextLine();
        }

        System.out.println("\n--- RELATÓRIO DE INVESTIMENTOS ---");
        System.out.println("Bronze: " + bronze);
        System.out.println("Prata: " + prata);
        System.out.println("Ouro: " + ouro);
        if (bronze > 0) {
            System.out.printf("Média Bronze = R$ %.2f\n", (somaBronze / bronze));
        }
        System.out.printf("Volume Total Aplicado = R$ %.2f\n", volumeTotal);
        teclado.close();
    }
}
```

---

### 📝 Questão 36: Distância Ponto-Reta até Ponto Coincidente
**Enunciado:** Solicite os coeficientes $A, B, C$ de uma reta $R: Ax + By + C = 0$. Em seguida, leia as coordenadas $(X_0, Y_0)$ de vários pontos. A repetição encerra quando for encontrado um ponto que pertença à reta ($Distância = 0$).

```java
import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Coeficiente A: ");
        double a = teclado.nextDouble();
        System.out.print("Coeficiente B: ");
        double b = teclado.nextDouble();
        System.out.print("Coeficiente C: ");
        double c = teclado.nextDouble();

        double d;
        double xo = 0, yo = 0;

        while (true) {
            System.out.print("\nCoordenada Xo: ");
            xo = teclado.nextDouble();
            System.out.print("Coordenada Yo: ");
            yo = teclado.nextDouble();

            d = Math.abs(a * xo + b * yo + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.printf("Distância = %.5f\n", d);

            if (d == 0.0) {
                break;
            }
        }

        System.out.printf("\nPonto coincidente encontrado: (%.2f, %.2f)\n", xo, yo);
        teclado.close();
    }
}
```

---

### 📝 Questão 37: Propagação Viral e Decomposição de Tempo
**Enunciado:** Uma população de tamanho $P$ começa com 1 infectado. A cada dia, o número de infectados cresce $0,3\%$ sobre o total acumulado. Calcule quantos anos (365 dias), meses (30 dias) e dias levará para infectar toda a população.

```java
import java.util.Scanner;

public class Questao37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a população total: ");
        double pop = teclado.nextDouble();

        double infectados = 1.0;
        int dias = 0;

        while (infectados < pop) {
            infectados += infectados * 0.003;
            dias++;
        }

        int anos = dias / 365;
        int resto = dias % 365;
        int meses = resto / 30;
        int diasResto = resto % 30;

        System.out.println("Tempo até a infecção total:");
        System.out.println("Anos = " + anos + " | Meses = " + meses + " | Dias = " + diasResto);
        teclado.close();
    }
}
```

---

### 📝 Questão 38: Censo Municipal e Validação de Consistência
**Enunciado:** Leia para cada cidade: nome, população, homens e mulheres. Se $homens + mulheres \ne populacao$, avise que os dados são inconsistentes. A última cidade é `"FIM"`. Imprima o total de cidades com mais mulheres que homens e a cidade com menor população.

```java
import java.util.Scanner;

public class Questao38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cidadesMaisMulheres = 0, total = 0;
        long menorPop = Long.MAX_VALUE;
        String cidadeMenorPop = "";

        System.out.print("Nome da cidade (ou FIM): ");
        String nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("População: ");
            long pop = teclado.nextLong();
            System.out.print("Homens: ");
            long homens = teclado.nextLong();
            System.out.print("Mulheres: ");
            long mulheres = teclado.nextLong();
            teclado.nextLine();

            if (homens + mulheres != pop) {
                System.out.println("ATENÇÃO: Soma de homens e mulheres difere da população!");
            }

            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            if (total == 0 || pop < menorPop) {
                menorPop = pop;
                cidadeMenorPop = nome;
            }
            total++;

            System.out.print("\nNome da cidade (ou FIM): ");
            nome = teclado.nextLine();
        }

        System.out.println("\n--- CENSO ---");
        System.out.println("Cidades com mais mulheres: " + cidadesMaisMulheres);
        System.out.println("Cidade com menor população: " + cidadeMenorPop + " (" + menorPop + " hab)");
        teclado.close();
    }
}
```

---

### 📝 Questão 39: Matriz Numérica Espelhada
**Enunciado:** Leia um número $N$ ($1$ a $9$) e imprima uma pirâmide numérica espelhada:
Se $N = 3$:
```
1 1
1 2 2 1
1 2 3 3 2 1
```

```java
import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe N (1 a 9): ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            // Crescente
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Decrescente
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 40: Desafio Completo de Prova (Folha com Produtividade Escalonada)
**Enunciado:** Uma empresa paga um valor por hora fixa e um prêmio por produtividade:
- Até 100 horas: R$ 1.000,00 de bônus fixo
- De 101 a 500 horas: R$ 10,00 por hora trabalhada
- Acima de 500 horas: R$ 100,00 por cada bloco de 10 horas completas
Leia os dados dos colaboradores até que o nome seja `"FIM"`. Calcule e imprima o salário de cada um, a média de horas trabalhadas e a pessoa com maior remuneração.

```java
import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor da hora base do projeto: R$ ");
        double valorHora = teclado.nextDouble();
        teclado.nextLine();

        double totalFolha = 0, somaHoras = 0, maiorSalario = -1;
        String nomeMaior = "";
        int totalTrabalhadores = 0;

        System.out.print("Nome do trabalhador (ou FIM): ");
        String nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Horas trabalhadas: ");
            double horas = teclado.nextDouble();
            teclado.nextLine();

            double premio;
            if (horas <= 100) {
                premio = 1000.00;
            } else if (horas <= 500) {
                premio = horas * 10.00;
            } else {
                premio = ((int)(horas / 10)) * 100.00;
            }

            double salarioFinal = (horas * valorHora) + premio;
            System.out.printf("Salário de %s: R$ %.2f (Bônus: R$ %.2f)\n", nome, salarioFinal, premio);

            somaHoras += horas;
            totalFolha += salarioFinal;
            totalTrabalhadores++;

            if (totalTrabalhadores == 1 || salarioFinal > maiorSalario) {
                maiorSalario = salarioFinal;
                nomeMaior = nome;
            }

            System.out.print("\nNome do trabalhador (ou FIM): ");
            nome = teclado.nextLine();
        }

        if (totalTrabalhadores > 0) {
            System.out.println("\n--- RESUMO DA FOLHA ---");
            System.out.printf("Média de horas trabalhadas = %.2f h\n", (somaHoras / totalTrabalhadores));
            System.out.printf("Pessoa com maior remuneração = %s (R$ %.2f)\n", nomeMaior, maiorSalario);
            System.out.printf("Custo total da folha = R$ %.2f\n", totalFolha);
        }

        teclado.close();
    }
}
```
