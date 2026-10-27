# Exercícios Resolvidos de Algoritmos
**Centro Universitário Dom Helder**  
**Professor:** Ricardo Luiz de Freitas  

Todas as resoluções foram desenvolvidas em **Java**, seguindo rigorosamente o material, a didática e os exemplos das apostilas (estruturas `for`, `do while`, `while`, séries numéricas, somatórios, contadores, flags fictícios/reais e validação de entrada com `Scanner`).

---

## 📁 Estrutura de Pastas e Arquivos

Cada exercício está isolado em sua própria pasta e em um único arquivo `.java`, permitindo execução direta ("apertar o play e rodar"):

```
exercicios_algoritmos/
├── conteudo_08/             # Estrutura de Repetição FOR
│   ├── exercicio_01/Exercicio01.java
│   ├── exercicio_02/Exercicio02.java
│   ├── exercicio_03/Exercicio03.java
│   ├── exercicio_04/Exercicio04.java
│   ├── exercicio_05/Exercicio05.java
│   ├── exercicio_05a/Exercicio05a.java
│   ├── exercicio_06/Exercicio06.java
│   ├── exercicio_07/Exercicio07.java
│   ├── exercicio_08/Exercicio08.java
│   ├── exercicio_09/Exercicio09.java
│   ├── exercicio_10/Exercicio10.java
│   ├── exercicio_11/Exercicio11.java
│   ├── exercicio_12/Exercicio12.java
│   ├── exercicio_13/
│   │   ├── Exercicio13.java
│   │   └── cidades.txt
│   ├── exercicio_14/Exercicio14.java
│   ├── exercicio_15/Exercicio15.java
│   ├── exercicio_16/Exercicio16.java
│   ├── exercicio_17/Exercicio17.java
│   ├── exercicio_18/Exercicio18.java
│   ├── exercicio_19/Exercicio19.java
│   ├── exercicio_20/Exercicio20.java
│   ├── exercicio_21/Exercicio21.java
│   ├── exercicio_22/Exercicio22.java
│   ├── exercicio_23/Exercicio23.java
│   ├── exercicio_24/Exercicio24.java
│   ├── exercicio_25/Exercicio25.java
│   ├── exercicio_26/Exercicio26.java
│   ├── exercicio_27/Exercicio27.java
│   ├── exercicio_28/Exercicio28.java
│   ├── exercicio_29/Exercicio29.java
│   ├── exercicio_30/Exercicio30.java
│   └── exercicio_31/Exercicio31.java
├── conteudo_09/             # Séries Matemáticas
│   ├── exercicio_01/Exercicio01.java
│   ├── exercicio_02/Exercicio02.java
│   ├── exercicio_03/Exercicio03.java
│   ├── exercicio_04/Exercicio04.java
│   ├── exercicio_05/Exercicio05.java
│   ├── exercicio_06/Exercicio06.java
│   ├── exercicio_07/Exercicio07.java
│   ├── exercicio_08/Exercicio08.java
│   ├── exercicio_09/Exercicio09.java
│   ├── exercicio_10a/Exercicio10a.java
│   ├── exercicio_10b/Exercicio10b.java
│   ├── exercicio_10c/Exercicio10c.java
│   ├── exercicio_10d/Exercicio10d.java
│   ├── exercicio_10e/Exercicio10e.java
│   ├── exercicio_10f/Exercicio10f.java
│   ├── exercicio_11a/Exercicio11a.java
│   ├── exercicio_11b/Exercicio11b.java
│   ├── exercicio_11c/Exercicio11c.java
│   ├── exercicio_11d/Exercicio11d.java
│   ├── exercicio_11e/Exercicio11e.java
│   ├── exercicio_11f/Exercicio11f.java
│   ├── exercicio_12/Exercicio12.java
│   └── exercicio_13/Exercicio13.java
├── conteudo_10/             # Estrutura de Repetição DO WHILE
│   ├── exercicio_01/Exercicio01.java
│   ├── exercicio_02/Exercicio02.java
│   ├── exercicio_03/Exercicio03.java
│   ├── exercicio_04/Exercicio04.java
│   ├── exercicio_05/Exercicio05.java
│   ├── exercicio_06/Exercicio06.java
│   ├── exercicio_07/Exercicio07.java
│   └── exercicio_08/Exercicio08.java
└── conteudo_11/             # Estrutura de Repetição WHILE
    ├── exercicio_01/Exercicio01.java
    ├── exercicio_02a/Exercicio02a.java
    ├── exercicio_02b/Exercicio02b.java
    ├── exercicio_02c/Exercicio02c.java
    ├── exercicio_03/
    │   ├── Exercicio03.java
    │   └── multas.txt
    ├── exercicio_04a/Exercicio04a.java
    ├── exercicio_04b/Exercicio04b.java
    ├── exercicio_05/Exercicio05.java
    ├── exercicio_06/Exercicio06.java
    ├── exercicio_07/Exercicio07.java
    ├── exercicio_08/Exercicio08.java
    ├── exercicio_09/
    │   ├── Exercicio09.java
    │   └── funcionarios.txt
    ├── exercicio_10/Exercicio10.java
    ├── exercicio_11/Exercicio11.java
    ├── exercicio_12/Exercicio12.java
    ├── exercicio_13/Exercicio13.java
    └── exercicio_14/Exercicio14.java
```

---

## 🚀 Como Executar

### 1. Pelo Antigravity IDE / VS Code / IntelliJ IDEA
Abra a pasta do projeto (`exercicios_algoritmos`) no seu editor/IDE.
Abra qualquer arquivo `.java` e clique no botão **Play** (ou **Run**) que aparece acima do método `main`.

### 2. Pelo Terminal
Você pode executar qualquer arquivo diretamente pelo comando `java`:
```bash
java conteudo_08/exercicio_01/Exercicio01.java
java conteudo_09/exercicio_01/Exercicio01.java
java conteudo_10/exercicio_01/Exercicio01.java
java conteudo_11/exercicio_01/Exercicio01.java
```

Ou compilar todos de uma só vez:
```bash
javac $(find . -name "*.java")
```
