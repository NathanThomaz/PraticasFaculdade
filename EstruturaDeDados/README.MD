# 📚 Estrutura de Dados em Java

Este repositório contém exercícios, listas e projetos desenvolvidos durante os estudos da disciplina de **Estrutura de Dados**, com foco em prática de programação em Java.

---

## 🎯 Finalidade

Este repositório tem como objetivo:

- Consolidar o conhecimento em estruturas como **listas, pilhas, filas, árvores** e **implementações com generics**;
- Praticar a organização de pacotes e modularização de código Java;
- Automatizar o processo de compilação com auxílio do `tasks.json`;
- Utilizar o **Visual Studio Code** como ambiente principal de desenvolvimento.

---

## 🛠️ Ambiente de Desenvolvimento

- **Linguagem:** Java 17+  
- **Editor:** [Visual Studio Code](https://code.visualstudio.com/)
- **Compilação automatizada:** `tasks.json` com suporte a `Ctrl+Shift+B`

> O projeto **não utiliza Maven ou Gradle**, apenas estrutura manual com `src/` e `bin/`.

---

## 🗂️ Estrutura de Pastas

```plaintext
Estrutura_De_Dados/
├── bin/                # Arquivos compilados (.class)
├── src/                # Código-fonte
│   └── estruturadedados/
│       ├── semana1/
│       ├── semana2/
│       ├── semana3/
│           └── exercicios/
│               ├── exercicio1/
│               └── exercicio2/
├── .vscode/
│   └── tasks.json      # Automatização da compilação via VSCode
└── sources.txt         # Lista gerada automaticamente com os .java
```

---

## ⚙️ Como Compilar

Para compilar todos os arquivos `.java`:

1. Abra o projeto no VSCode.
2. Pressione `Ctrl + Shift + B`.
3. Ele irá:
    - Gerar automaticamente a lista de arquivos `sources.txt`.
    - Compilar todos os `.java` e enviar os `.class` para `bin/`.

---

## ▶️ Como Executar um Programa

Para rodar um `.class` compilado:

1. Abra o terminal integrado no VSCode.
2. Vá até a pasta `bin`:

    ```bash
    cd bin
    ```

3. Rode a classe desejada usando o nome completo do pacote. Exemplo:

    ```bash
    java estruturadedados.semana3.exercicios.exercicio2.MainExercicio2
    ```

---

## 📌 Observações

- Evite usar nomes de pastas com espaço, como `Estrutura De Dados`. Prefira `Estrutura_De_Dados`.
- O arquivo `sources.txt` é gerado automaticamente e pode ser incluído no `.gitignore` se desejado.
- Todos os programas utilizam codificação UTF-8 e são preparados para funcionar no terminal do Windows.

---

## 🚀 Contribuindo

Este repositório é voltado para fins educacionais, mas sugestões e melhorias são bem-vindas!
