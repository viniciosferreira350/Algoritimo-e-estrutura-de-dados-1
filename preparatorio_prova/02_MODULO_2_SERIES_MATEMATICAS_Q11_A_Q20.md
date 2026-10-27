# 🎯 MÓDULO 2: SÉRIES MATEMÁTICAS E DECOMPOSIÇÃO DE FÓRMULAS
**Foco:** Conteúdo 9 (Séries Finitas e Infinitas, Numerador/Denominador, Raízes, Potências, Fatoriais, Sinais Alternados)

---

### 📝 Questão 11: Progressão Aritmética no Numerador e Denominador
**Enunciado:** Calcule e imprima o valor da série abaixo para 50 termos:
$$S = \\frac{1}{2} + \\frac{3}{5} + \\frac{5}{8} + \\frac{7}{11} + \\dots$$

#### 🧩 Metodologia Dividir e Conquistar:
1. **Numerador:** $1, 3, 5, 7, \dots \rightarrow$ Razão $2$. Fórmula: $2 \times aux - 1$.
   - Teste: $aux = 1 \rightarrow 2(1)-1 = 1$; $aux = 2 \rightarrow 2(2)-1 = 3$. Perfeito.
2. **Denominador:** $2, 5, 8, 11, \dots \rightarrow$ Razão $3$. Fórmula: $3 \times aux - 1$.
   - Teste: $aux = 1 \rightarrow 3(1)-1 = 2$; $aux = 2 \rightarrow 3(2)-1 = 5$. Perfeito.
3. **Acumulação:** `serie += num / den;`.

```java
public class Questao11 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 50; aux++) {
            double num = 2.0 * aux - 1.0;
            double den = 3.0 * aux - 1.0;
            serie += num / den;
        }
        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 12: Raiz Quadrada no Denominador
**Enunciado:** Calcule e imprima o valor da série para 30 termos:
$$S = \\frac{1}{\\sqrt{3}} + \\frac{2}{\\sqrt{5}} + \\frac{3}{\\sqrt{7}} + \\frac{4}{\\sqrt{9}} + \\dots$$

#### 🧩 Metodologia Dividir e Conquistar:
1. **Numerador:** $aux$ direto ($1, 2, 3, 4, \dots$).
2. **Denominador:** $\\sqrt{2 \times aux + 1}$.
   - Para $aux=1$: $\\sqrt{3}$; $aux=2$: $\\sqrt{5}$; $aux=3$: $\\sqrt{7}$.
3. **Código em Java:** `Math.sqrt(2.0 * aux + 1.0)`.

```java
public class Questao12 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 30; aux++) {
            double num = aux;
            double den = Math.sqrt(2.0 * aux + 1.0);
            serie += num / den;
        }
        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 13: Série com Sinais Alternados (+ e -)
**Enunciado:** Calcule e imprima o valor da série com 40 termos:
$$S = \\frac{1}{1} - \\frac{2}{4} + \\frac{3}{9} - \\frac{4}{16} + \\frac{5}{25} - \\dots$$

#### 🧩 Metodologia Dividir e Conquistar:
1. **Módulo do termo:** $\\frac{aux}{aux^2} = \\frac{1}{aux}$.
2. **Alternância de Sinais:**
   - Termos ímpares ($aux = 1, 3, 5$): Positivos ($+$).
   - Termos pares ($aux = 2, 4, 6$): Negativos ($-$).
3. **Técnica:** `if (aux % 2 == 1) serie += termo; else serie -= termo;`

```java
public class Questao13 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 40; aux++) {
            double termo = (double) aux / Math.pow(aux, 2);
            if (aux % 2 == 1) {
                serie += termo;
            } else {
                serie -= termo;
            }
        }
        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 14: Série com Potência de $X$ e $N$ Termos
**Enunciado:** Faça um programa que solicite ao usuário um valor real $X$ e uma quantidade inteira de termos $N$, calculando:
$$S = \\frac{X^1}{2} + \\frac{X^2}{4} + \\frac{X^3}{6} + \\dots + \\frac{X^N}{2N}$$

```java
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de X: ");
        double x = teclado.nextDouble();
        System.out.print("Informe a quantidade de termos N: ");
        int n = teclado.nextInt();

        double serie = 0;
        for (int aux = 1; aux <= n; aux++) {
            double num = Math.pow(x, aux);
            double den = 2.0 * aux;
            serie += num / den;
        }

        System.out.printf("Valor da Série = %.6f\n", serie);
        teclado.close();
    }
}
```

---

### 📝 Questão 15: Fatorial Progressivo no Numerador
**Enunciado:** Calcule e imprima o valor da série para 10 termos:
$$S = \\frac{1!}{2^1} + \\frac{2!}{2^2} + \\frac{3!}{2^3} + \\dots + \\frac{10!}{2^{10}}$$

#### 🧩 Metodologia Dividir e Conquistar:
1. **Como calcular fatorial sem recalcular do zero:**
   - Inicie `double fat = 1.0;` fora do laço.
   - Em cada iteração: `fat *= aux;`. Pronto!
2. **Denominador:** `Math.pow(2.0, aux)`.

```java
public class Questao15 {
    public static void main(String[] args) {
        double serie = 0;
        double fat = 1.0;

        for (int aux = 1; aux <= 10; aux++) {
            fat *= aux; // 1!, 2!, 3!, ...
            double den = Math.pow(2.0, aux);
            serie += fat / den;
        }

        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 16: Transformação Global com Raiz Cúbica Externa
**Enunciado:** Calcule o valor da série para 25 termos:
$$S = 100 + \\sqrt[3]{\\sum_{aux=1}^{25} \\frac{aux \times 10}{(aux+1)^2}}$$

#### 🧩 Metodologia Dividir e Conquistar:
1. **Passo Interno:** Acumule apenas a soma das frações dentro do laço.
2. **Passo Externo:** Após o laço terminar, aplique `Math.cbrt(soma)` e some $100$.

```java
public class Questao16 {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 25; aux++) {
            double num = aux * 10.0;
            double den = Math.pow(aux + 1.0, 2);
            soma += num / den;
        }

        double serie = 100.0 + Math.cbrt(soma);
        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 17: Numerador Composto de Dois Termos
**Enunciado:** Calcule a série para 20 termos:
$$S = \\frac{2 + \\sqrt{4}}{5} + \\frac{4 + \\sqrt{7}}{9} + \\frac{6 + \\sqrt{10}}{13} + \\dots$$

#### 🧩 Metodologia Dividir e Conquistar:
1. **Parte 1 do Numerador:** $2, 4, 6, 8 \dots \rightarrow 2 \times aux$.
2. **Parte 2 do Numerador:** $\\sqrt{4}, \\sqrt{7}, \\sqrt{10} \dots \rightarrow \\sqrt{3 \times aux + 1}$.
3. **Denominador:** $5, 9, 13, 17 \dots \rightarrow 4 \times aux + 1$.

```java
public class Questao17 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 20; aux++) {
            double p1 = 2.0 * aux;
            double p2 = Math.sqrt(3.0 * aux + 1.0);
            double den = 4.0 * aux + 1.0;
            serie += (p1 + p2) / den;
        }
        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 18: Potência Global Externa
**Enunciado:** Calcule a série para 15 termos:
$$S = 5 \times \\left( \\sum_{aux=1}^{15} \\frac{3 \times aux}{aux^2 + 2} \\right)^2$$

```java
public class Questao18 {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux = 1; aux <= 15; aux++) {
            double num = 3.0 * aux;
            double den = Math.pow(aux, 2) + 2.0;
            soma += num / den;
        }

        double serie = 5.0 * Math.pow(soma, 2);
        System.out.printf("Valor da Série = %.6f\n", serie);
    }
}
```

---

### 📝 Questão 19: Constante de Euler ($e$) por Série Finita
**Enunciado:** O número de Euler $e$ pode ser calculado pela série $e = 1 + \\frac{1}{1!} + \\frac{1}{2!} + \\frac{1}{3!} + \\dots$. Faça um programa que calcule os 12 primeiros termos e compare com `Math.E`.

```java
public class Questao19 {
    public static void main(String[] args) {
        double eCalculado = 1.0;
        double fat = 1.0;

        for (int aux = 1; aux <= 12; aux++) {
            fat *= aux;
            eCalculado += 1.0 / fat;
        }

        System.out.printf("Euler Calculado = %.10f\n", eCalculado);
        System.out.printf("Euler Nativo Math.E = %.10f\n", Math.E);
    }
}
```

---

### 📝 Questão 20: Desafio de Série com Termos Alternados e Potência
**Enunciado:** Calcule para $N$ termos (informado pelo usuário):
$$S = \\frac{1}{2^1 - 1} - \\frac{2}{2^2 - 1} + \\frac{3}{2^3 - 1} - \\frac{4}{2^4 - 1} + \\dots$$

```java
import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de termos: ");
        int n = teclado.nextInt();

        double serie = 0;
        for (int aux = 1; aux <= n; aux++) {
            double num = aux;
            double den = Math.pow(2.0, aux) - 1.0;
            double termo = num / den;

            if (aux % 2 == 1) {
                serie += termo;
            } else {
                serie -= termo;
            }
        }

        System.out.printf("Valor da Série = %.8f\n", serie);
        teclado.close();
    }
}
```
