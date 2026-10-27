# 🎯 MÓDULO 3: COMANDO `DO WHILE`, FLAGS E VALIDAÇÃO DE ENTRADA
**Foco:** Conteúdo 10 (Laço `do while`, Diferença entre Flag Fictício e Flag Real, Validações de Entrada)

---

### 📝 Questão 21: Flag Fictício Numérico com Cálculo de Média
**Enunciado:** Faça um programa para ler uma série indeterminada de números inteiros positivos. O último número digitado será $-1$ (flag fictício) e não deverá entrar nos cálculos. Calcule e imprima a média e a quantidade de números pares digitados.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Identificar o Flag:** O valor $-1$ encerra o laço.
2. **Proteção:** Utilizar `if (numero != -1)` dentro do `do while` para garantir que $-1$ não seja somado nem contado.
3. **Pares:** `if (numero % 2 == 0) pares++;`.

```java
import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        int numero, cont = 0, pares = 0;
        double soma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite -1 para finalizar.");
        do {
            System.out.print("Informe um número inteiro: ");
            numero = teclado.nextInt();

            if (numero != -1) {
                soma += numero;
                cont++;
                if (numero % 2 == 0) {
                    pares++;
                }
            }
        } while (numero != -1);

        if (cont > 0) {
            double media = soma / cont;
            System.out.printf("Média = %.2f\n", media);
            System.out.println("Quantidade de pares = " + pares);
        } else {
            System.out.println("Nenhum número foi informado!");
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 22: Flag Fictício em String com Acúmulo Financeiro
**Enunciado:** Uma loja quer somar os valores das compras do dia. O programa deve ler a descrição do produto e o seu valor. A digitação encerra quando o usuário informar a descrição `"FIM"` (flag fictício). Calcule e imprima o valor total e a quantidade de itens comprados.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Regra de String:** Usar `!descricao.equalsIgnoreCase("FIM")`.
2. **Buffer:** Ler String $\rightarrow$ Ler double $\rightarrow$ `teclado.nextLine()`.

```java
import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        String descricao;
        double valor, total = 0;
        int itens = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para encerrar digite FIM na descrição.");
        do {
            System.out.print("Descrição do item: ");
            descricao = teclado.nextLine();

            if (!descricao.equalsIgnoreCase("FIM")) {
                System.out.print("Valor do item (R$): ");
                valor = teclado.nextDouble();
                teclado.nextLine(); // Limpa buffer

                total += valor;
                itens++;
            }
        } while (!descricao.equalsIgnoreCase("FIM"));

        System.out.printf("\nTotal de itens = %d\n", itens);
        System.out.printf("Valor total arrecadado = R$ %.2f\n", total);
        teclado.close();
    }
}
```

---

### 📝 Questão 23: Flag Real (O Último Elemento ENTRA nos Cálculos)
**Enunciado:** Um campeonato analisa notas de atletas. O último atleta da lista oficial é `"Campeão Especial"` (flag real). Todos os atletas, **incluindo o Campeão Especial**, devem ter suas notas computadas. Ao final, imprima a maior nota e a média geral.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Diferença Chave:** Não use `if` para bloquear o processamento do flag! Processe primeiro e teste a condição de saída no `while`.

```java
import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        String nome;
        double nota, soma = 0, maiorNota = -1;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("O último atleta da lista é Campeão Especial (entra nos cálculos).");
        do {
            System.out.print("Nome do atleta: ");
            nome = teclado.nextLine();
            System.out.print("Nota: ");
            nota = teclado.nextDouble();
            teclado.nextLine(); // Limpa buffer

            // Processa TODOS sem exceção
            soma += nota;
            cont++;
            if (cont == 1 || nota > maiorNota) {
                maiorNota = nota;
            }

        } while (!nome.equalsIgnoreCase("Campeão Especial"));

        double media = soma / cont;
        System.out.printf("\nMédia geral = %.2f\n", media);
        System.out.printf("Maior nota obtida = %.2f\n", maiorNota);
        teclado.close();
    }
}
```

---

### 📝 Questão 24: Validação Numérica com `do while`
**Enunciado:** Faça um programa que solicite ao usuário uma opção de menu ($1$ a $4$). Se o usuário digitar qualquer valor fora dessa faixa, exiba uma mensagem de erro e repita a solicitação até que ele digite uma opção válida.

```java
import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Escolha uma opção (1-Cadastrar, 2-Consultar, 3-Alterar, 4-Sair): ");
            opcao = teclado.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao < 1 || opcao > 4);

        System.out.println("Opção selecionada com sucesso: " + opcao);
        teclado.close();
    }
}
```

---

### 📝 Questão 25: Validação de String (Sexo ou Situação)
**Enunciado:** Solicite o sexo de uma pessoa (`"M"` para masculino ou `"F"` para feminino). Enquanto o usuário digitar qualquer texto diferente de `"M"` e `"F"`, repita a leitura avisando do erro.

#### 🧩 Metodologia Dividir e Conquistar:
1. **Lógica Booleana:** A condição de repetição é: `!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")`.

```java
import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        String sexo;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o sexo (M/F): ");
            sexo = teclado.nextLine();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Entrada inválida! Digite apenas M ou F.");
            }
        } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));

        System.out.println("Sexo validado: " + sexo.toUpperCase());
        teclado.close();
    }
}
```

---

### 📝 Questão 26: Validação de Notas Escolares (0 a 100)
**Enunciado:** Crie um algoritmo que leia duas notas bimestrais de um aluno. Cada nota deve ser obrigatoriamente validada no intervalo $[0, 100]$. Ao final, calcule a média e informe se o aluno está aprovado ($\ge 60$).

```java
import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        double n1, n2;
        Scanner teclado = new Scanner(System.in);

        // Validação da Nota 1
        do {
            System.out.print("Informe a 1ª nota (0 a 100): ");
            n1 = teclado.nextDouble();
            if (n1 < 0 || n1 > 100) {
                System.out.println("Nota inválida! Deve estar entre 0 e 100.");
            }
        } while (n1 < 0 || n1 > 100);

        // Validação da Nota 2
        do {
            System.out.print("Informe a 2ª nota (0 a 100): ");
            n2 = teclado.nextDouble();
            if (n2 < 0 || n2 > 100) {
                System.out.println("Nota inválida! Deve estar entre 0 e 100.");
            }
        } while (n2 < 0 || n2 > 100);

        double media = (n1 + n2) / 2.0;
        System.out.printf("Média final = %.2f\n", media);
        if (media >= 60.0) {
            System.out.println("Resultado: APROVADO");
        } else {
            System.out.println("Resultado: REPROVADO");
        }

        teclado.close();
    }
}
```

---

### 📝 Questão 27: Sistema de Menu Repetitivo com Opção de Saída (0)
**Enunciado:** Construa um menu com as opções:
`1-Converter Celsius para Fahrenheit`, `2-Converter Fahrenheit para Celsius`, `0-Sair`.
O menu deve reaparecer após cada cálculo e só encerrar quando for digitado 0.

```java
import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n--- MENU CONVERSÃO ---");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Temperatura em Celsius: ");
                    double c = teclado.nextDouble();
                    double f = (c * 9.0 / 5.0) + 32.0;
                    System.out.printf("Em Fahrenheit: %.2f°F\n", f);
                    break;
                case 2:
                    System.out.print("Temperatura em Fahrenheit: ");
                    double fIn = teclado.nextDouble();
                    double cOut = (fIn - 32.0) * 5.0 / 9.0;
                    System.out.printf("Em Celsius: %.2f°C\n", cOut);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        teclado.close();
    }
}
```

---

### 📝 Questão 28: Cálculo de Custo Parcial e BDI até Flag "FIM"
**Enunciado:** Leia no início a taxa de BDI em $\%$. Em seguida, leia o nome do insumo, a quantidade e o preço unitário até que o nome seja `"FIM"`. A cada insumo lido, informe o custo parcial. Ao final, informe o Custo Total, o valor do BDI e o Preço Final.

```java
import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {
        double bdi, custoTotal = 0;
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a taxa de BDI (%): ");
        bdi = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digite FIM no nome para encerrar.");
        do {
            System.out.print("Nome do insumo: ");
            nome = teclado.nextLine();

            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.print("Quantidade consumida: ");
                double qtd = teclado.nextDouble();
                System.out.print("Preço unitário: ");
                double preco = teclado.nextDouble();
                teclado.nextLine(); // Limpa buffer

                double custoParcial = qtd * preco;
                System.out.printf("Custo parcial = R$ %.2f\n", custoParcial);
                custoTotal += custoParcial;
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        double valorBdi = custoTotal * bdi / 100.0;
        double precoFinal = custoTotal + valorBdi;

        System.out.printf("\nCusto Total = R$ %.2f\n", custoTotal);
        System.out.printf("Valor do BDI (%.1f%%) = R$ %.2f\n", bdi, valorBdi);
        System.out.printf("Preço Final = R$ %.2f\n", precoFinal);

        teclado.close();
    }
}
```

---

### 📝 Questão 29: Pesquisa Demográfica com Flag de Parada na Altura
**Enunciado:** Leia a altura, peso e sexo de várias pessoas. Condição de parada: altura igual a $0$. Calcule e imprima:
- Total de pessoas;
- Quantidade de mulheres;
- Média da altura dos homens;
- Quantidade de pessoas com mais de 80kg.

```java
import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        double altura, peso, somaAltHomens = 0;
        String sexo;
        int total = 0, mulheres = 0, homens = 0, pesoMais80 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para finalizar digite 0 na altura.");
        do {
            System.out.print("Altura (m): ");
            altura = teclado.nextDouble();

            if (altura != 0) {
                System.out.print("Peso (kg): ");
                peso = teclado.nextDouble();
                teclado.nextLine(); // Limpa buffer

                // Valida sexo
                do {
                    System.out.print("Sexo (M/F): ");
                    sexo = teclado.nextLine();
                } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));

                total++;
                if (sexo.equalsIgnoreCase("F")) {
                    mulheres++;
                } else {
                    homens++;
                    somaAltHomens += altura;
                }

                if (peso > 80.0) {
                    pesoMais80++;
                }
            }
        } while (altura != 0);

        System.out.println("\nTotal de pessoas = " + total);
        System.out.println("Quantidade de mulheres = " + mulheres);
        if (homens > 0) {
            System.out.printf("Altura média dos homens = %.2f m\n", (somaAltHomens / homens));
        }
        System.out.println("Pessoas com mais de 80kg = " + pesoMais80);

        teclado.close();
    }
}
```

---

### 📝 Questão 30: Setor Circular com Ângulo Fixo e Vários Raios
**Enunciado:** Leia uma única vez o ângulo $\\alpha$ de um setor circular. Em seguida, leia sucessivos valores de raio $R$ e imprima a área do setor correspondente: $S = \\frac{\\alpha \\times 3.1416 \\times R^2}{360}$. A repetição encerra quando for digitado $R = -1$.

```java
import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o ângulo alpha (em graus): ");
        double alpha = teclado.nextDouble();

        double r;
        System.out.println("Digite -1 no raio para finalizar.");
        do {
            System.out.print("Informe o raio R: ");
            r = teclado.nextDouble();

            if (r != -1) {
                double s = (alpha * 3.1416 * Math.pow(r, 2)) / 360.0;
                System.out.printf("Área do setor circular = %.4f\n", s);
            }
        } while (r != -1);

        teclado.close();
    }
}
```
