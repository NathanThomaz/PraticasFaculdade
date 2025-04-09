# Semana 2 - Teste e Qualidade de Software 🌡️

Nesta semana, desenvolvi um projeto simples e funcional com foco em boas práticas de código, reutilização de métodos e estruturação para testes. O projeto escolhido foi um **Conversor de Temperatura**, permitindo converter entre Celsius e Fahrenheit, com validações apropriadas.

## 📂 Conteúdo Desenvolvido

### ✅ 1. Separação da Lógica em Classes

Implementei duas classes principais:

- **ConversorTemperatura**: contém os métodos de conversão de temperatura e validação.
- **Main**: responsável pela interação com o usuário, entrada de dados e exibição dos resultados.

Essa estrutura permite que a lógica do sistema seja testada separadamente da interface com o usuário.

### ✅ 2. Criação de Métodos Reutilizáveis

Cada funcionalidade foi implementada como um método independente e reutilizável:

- `celsiusParaFahrenheit(double celsius)`
- `fahrenheitParaCelsius(double fahrenheit)`
- `temperaturaEhValida(double temperatura)`

Essa abordagem facilita a leitura do código e sua expansão, além de permitir testes unitários isolados para cada método.

### ✅ 3. Validação de Temperaturas

Incluí uma regra de validação baseada no **zero absoluto (-273.15 °C)**, que representa a menor temperatura física possível.

Isso garante que o programa não aceite valores que violam as leis da termodinâmica e fornece ao usuário mensagens claras em casos de erro.

## 🛠️ Objetivo

O objetivo desta semana foi **aprimorar a organização do código**, criar métodos com responsabilidade única, e preparar o sistema para testes automatizados, alinhando com os princípios de qualidade e confiabilidade de software.

---

Feito com 💻 por [Nathan Thomaz](https://github.com/NathanThomaz)
