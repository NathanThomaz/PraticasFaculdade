# Cadastro de Automóveis – Estrutura de Dados

Este projeto Java permite gerenciar um cadastro de automóveis utilizando `ArrayList<Automovel>` e persistência em arquivo `.txt`. Foi desenvolvido como parte das atividades da disciplina de **Estrutura de Dados**.

---

## Estrutura do Projeto

```bash
PraticasFaculdade/
└── EstruturaDeDados/
└── src/
└── estruturadedados/
└── semana4/
├── CadastroAutomoveis/
│ ├── Automovel.java
│ ├── AutomovelManager.java
│ └── Main.java
└── data/
└── automoveis.txt
```

---

## Funcionalidades

- [x] Inserção de automóveis com validação da placa
- [x] Exclusão de automóvel por placa
- [x] Alteração de dados do automóvel
- [x] Consulta por placa
- [x] Listagem ordenada (placa, modelo ou marca)
- [x] Leitura e gravação de dados em arquivo `.txt` (formato CSV)

---

## Formato do arquivo `automoveis.txt`

Arquivo localizado em `data/automoveis.txt` com os dados salvos no seguinte formato:
```bash
placa,modelo,marca,ano,valor
ABC1234,Civic,Honda,2018,85000.0
DEF5678,Corolla,Toyota,2020,92000.0
...
```

---

## Como executar

1. Certifique-se de estar na pasta `src/estruturadedados/semana4/`
2. Compile os arquivos:

```bash
javac CadastroAutomoveis/*.java
```
3. Execute o programa:

```bash
java CadastroAutomoveis.Main
```

---

## 👨‍💻 Autor

- Nathan Thomaz
- Projeto acadêmico – Estrutura de Dados
