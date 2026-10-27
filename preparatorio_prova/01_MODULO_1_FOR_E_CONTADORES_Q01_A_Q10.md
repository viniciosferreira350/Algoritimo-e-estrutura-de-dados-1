# 🎯 MÓDULO 1: DOMÍNIO DO COMANDO `FOR`, CONTADORES E ACUMULADORES
**Foco:** Conteúdo 8 (Repetições Definidas, Contagens, Somatórios, Média, Maior/Menor)

---

### 📝 Questão 01: Contagem e Somatório de Positivos e Negativos
**Enunciado:** Faça um programa que solicite ao usuário 10 números inteiros. Calcule e imprima:
- A quantidade de números positivos (maiores ou iguais a zero);
- A quantidade de números negativos;
- A soma de todos os números negativos.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Entradas:** 10 números inteiros informados pelo usuário.
2. **Estrutura:** Laço `for (int aux = 1; aux <= 10; aux++)`.
3. **Filtro/Condição:** Se `numero >= 0`, incrementa `contPositivos`. Senão, incrementa `contNegativos` e acumula `somaNegativos += numero`.
4. **Saídas:** Imprimir os três resultados no final.

```java
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int contPositivos = 0, contNegativos = 0, somaNegativos = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe o " + aux + "º número: ");
            int numero = teclado.nextInt();

            if (numero >= 0) {
                contPositivos++;
            } else {
                contNegativos++;
                somaNegativos += numero;
            }
        }

        System.out.println("Quantidade de positivos = " + contPositivos);
        System.out.println("Quantidade de negativos = " + contNegativos);
        System.out.println("Soma dos negativos = " + somaNegativos);
        teclado.close();
    }
}
```

---

### 📝 Questão 02: Múltiplos e Divisibilidade no Intervalo
**Enunciado:** Faça um programa que leia um número $N$ no início e, para todos os números inteiros de 1 até $N$, informe se cada número é divisível por 5. Ao final, imprima a quantidade de números divisíveis por 5 e a soma deles.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Entrada:** Um número inteiro $N$.
2. **Estrutura:** `for (int aux = 1; aux <= N; aux++)`.
3. **Teste de Divisibilidade:** Operador resto `%`. Se `aux % 5 == 0`, o número é múltiplo.
4. **Acumulação:** Incrementar contador e somar o valor de `aux`.

```java
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int cont = 0, soma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o limite N: ");
        int n = teclado.nextInt();

        for (int aux = 1; aux <= n; aux++) {
            if (aux % 5 == 0) {
                System.out.println(aux + " é divisível por 5");
                cont++;
                soma += aux;
            }
        }

        System.out.println("Total de divisíveis por 5 = " + cont);
        System.out.println("Soma dos divisíveis por 5 = " + soma);
        teclado.close();
    }
}
```

---

### 📝 Questão 03: Média de Notas com Filtro de Intervalo (1 a 100)
**Enunciado:** Faça um programa que leia as notas de 8 alunos. Calcule e imprima a média apenas dos alunos que tiraram notas válidas entre 0 e 100. Se nenhuma nota for válida, avise o usuário.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Armadilha:** Não dividir por 8! Dividir apenas pela quantidade de notas válidas (`contValidas`).
2. **Filtro:** `if (nota >= 0 && nota <= 100)`.
3. **Cuidado:** Testar `if (contValidas > 0)` antes de calcular a média.

```java
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        double soma = 0;
        int contValidas = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 8; aux++) {
            System.out.print("Informe a nota do aluno " + aux + ": ");
            double nota = teclado.nextDouble();

            if (nota >= 0 && nota <= 100) {
                soma += nota;
                contValidas++;
            } else {
                System.out.println("Nota fora da faixa (ignorada)");
            }
        }

        if (contValidas > 0) {
            double media = soma / contValidas;
            System.out.printf("Média das notas válidas = %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi informada!");
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 04: Aprovado/Reprovado por Nota e Frequência
**Enunciado:** Uma disciplina tem 10 alunos. Para ser aprovado, o aluno precisa de Nota $\ge 60$ **e** Total de Faltas $\le 15$. Faça um programa que leia a nota e as faltas de cada aluno, informe a situação individual e, no final, a quantidade total de aprovados e reprovados.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Condição Composta:** `if (nota >= 60 && faltas <= 15)`.
2. **Contadores Independentes:** `aprovados++` e `reprovados++`.

```java
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        int aprovados = 0, reprovados = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Aluno " + aux + " - Nota: ");
            double nota = teclado.nextDouble();
            System.out.print("Aluno " + aux + " - Faltas: ");
            int faltas = teclado.nextInt();

            if (nota >= 60 && faltas <= 15) {
                System.out.println("Situação: APROVADO");
                aprovados++;
            } else {
                System.out.println("Situação: REPROVADO");
                reprovados++;
            }
        }

        System.out.println("\nTotal de Aprovados: " + aprovados);
        System.out.println("Total de Reprovados: " + reprovados);
        teclado.close();
    }
}
```

---

### 📝 Questão 05: Pesquisa de Maior e Menor Preço com Nome do Posto
**Enunciado:** Faça um programa para pesquisar o preço do combustível em 5 postos. O programa deverá ler o nome do posto e o preço do combustível, e ao final informar:
- O nome e o preço do posto mais caro;
- O nome e o preço do posto mais barato.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Técnica do 1º Elemento:** `if (aux == 1 || preco > maiorPreco)`.
2. **Buffer do Java:** Lembrar de `teclado.nextLine()` após `nextDouble()`.

```java
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        double maiorPreco = 0, menorPreco = 0;
        String postoMaisCaro = "", postoMaisBarato = "";
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 5; aux++) {
            System.out.print("Nome do Posto " + aux + ": ");
            String nome = teclado.nextLine();
            System.out.print("Preço da gasolina: ");
            double preco = teclado.nextDouble();
            teclado.nextLine(); // Evita bug do Java

            if (aux == 1 || preco > maiorPreco) {
                maiorPreco = preco;
                postoMaisCaro = nome;
            }
            if (aux == 1 || preco < menorPreco) {
                menorPreco = preco;
                postoMaisBarato = nome;
            }
        }

        System.out.printf("\nPosto mais caro: %s (R$ %.2f)\n", postoMaisCaro, maiorPreco);
        System.out.printf("Posto mais barato: %s (R$ %.2f)\n", postoMaisBarato, menorPreco);
        teclado.close();
    }
}
```

---

### 📝 Questão 06: Estatística de Faixas Etárias e Percentuais
**Enunciado:** Leia a idade de 15 pessoas e calcule:
- Quantidade de menores de idade ($< 18$);
- Quantidade de adultos ($18$ a $59$);
- Quantidade de idosos ($\ge 60$);
- O percentual de idosos em relação ao total.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Contadores de Faixa:** `menores`, `adultos`, `idosos`.
2. **Cálculo Percentual:** `(idosos * 100.0) / 15.0`.

```java
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        int menores = 0, adultos = 0, idosos = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 15; aux++) {
            System.out.print("Idade da pessoa " + aux + ": ");
            int idade = teclado.nextInt();

            if (idade < 18) {
                menores++;
            } else if (idade <= 59) {
                adultos++;
            } else {
                idosos++;
            }
        }

        double percIdosos = (idosos * 100.0) / 15.0;

        System.out.println("Menores de 18: " + menores);
        System.out.println("Adultos (18-59): " + adultos);
        System.out.println("Idosos (>=60): " + idosos);
        System.out.printf("Percentual de idosos = %.2f%%\n", percIdosos);
        teclado.close();
    }
}
```

---

### 📝 Questão 07: Apuração de Votação (Candidato 1, 2 e Nulos)
**Enunciado:** Faça um programa para apurar 20 votos de uma eleição entre Candidato 1 e Candidato 2. Qualquer voto diferente de 1 e 2 é considerado nulo. Ao final, imprima a quantidade de votos de cada um, a quantidade de nulos e o nome do vencedor (ou mensagem de empate).

```java
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        int v1 = 0, v2 = 0, nulos = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 20; aux++) {
            System.out.print("Voto do eleitor " + aux + " (1-Candidato 1, 2-Candidato 2): ");
            int voto = teclado.nextInt();

            if (voto == 1) {
                v1++;
            } else if (voto == 2) {
                v2++;
            } else {
                nulos++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Candidato 1: " + v1 + " votos");
        System.out.println("Candidato 2: " + v2 + " votos");
        System.out.println("Nulos: " + nulos + " votos");

        if (v1 > v2) {
            System.out.println("Vencedor: Candidato 1");
        } else if (v2 > v1) {
            System.out.println("Vencedor: Candidato 2");
        } else {
            System.out.println("Resultado: EMPATE");
        }
        teclado.close();
    }
}
```

---

### 📝 Questão 08: Tabuada Personalizada com Controle de Limite
**Enunciado:** Solicite ao usuário qual tabuada ele quer ver (número $N$) e até qual multiplicador $M$ ele quer calcular. Gere a tabuada de 1 até $M$.

```java
import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Deseja ver a tabuada de qual número? ");
        int n = teclado.nextInt();
        System.out.print("Até qual multiplicador? ");
        int m = teclado.nextInt();

        for (int aux = 1; aux <= m; aux++) {
            System.out.println(aux + " x " + n + " = " + (aux * n));
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 09: Padrão Visual em Triângulo com `for` Aninhado
**Enunciado:** Leia um número inteiro $N$ ($1$ a $10$) e gere o padrão abaixo:
Se $N = 4$:
```
#
# #
# # #
# # # #
```

#### 🧩 Metodologia Dividir e Conquistar:
1. **Loop Externo (`i`):** Controla o número da linha (de 1 até $N$).
2. **Loop Interno (`j`):** Controla a quantidade de símbolos daquela linha (de 1 até $i$).
3. **Quebra de linha:** `System.out.println();` fora do loop interno, dentro do externo.

```java
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe N (1 a 10): ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 10: Simulação Financeira de Rendimento Mensal
**Enunciado:** Uma pessoa aplicou um capital inicial $C$ a uma taxa de juros fixa de $0,8\%$ ao mês durante 12 meses. Faça um programa que imprima o saldo mês a mês e o ganho total de juros ao fim de 1 ano.

```java
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o capital inicial aplicado (R$): ");
        double saldo = teclado.nextDouble();
        double capitalInicial = saldo;

        for (int mes = 1; mes <= 12; mes++) {
            saldo += saldo * 0.008; // Rende 0.8%
            System.out.printf("Mês %2d: R$ %.2f\n", mes, saldo);
        }

        double lucro = saldo - capitalInicial;
        System.out.printf("\nRendimento total após 12 meses = R$ %.2f\n", lucro);
        teclado.close();
    }
}
```
