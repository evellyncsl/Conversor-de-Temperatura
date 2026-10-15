# 🌡️ Conversor de Temperatura em Java

Este é um projeto simples desenvolvido em Java com o objetivo de **estudo e fixação** dos conceitos fundamentais da linguagem.

O programa funciona no terminal, permitindo que o usuário insira um valor de temperatura e escolha a unidade desejada de destino (**Celsius** ou **Fahrenheit**).

## 🚀 Funcionalidades

* **Conversão para Celsius (`C`)**: Converte a temperatura informada de Fahrenheit para Celsius utilizando a fórmula:
  

  $$
  C = \frac{(F - 32) \times 5}{9}
  $$

* **Conversão para Fahrenheit (`F`)**: Converte a temperatura informada de Celsius para Fahrenheit utilizando a fórmula:
  

  $$
  F = \left(T \times \frac{9}{5}\right) + 32
  $$

* **Tratamento de Texto**: Uso de `.toUpperCase()` para aceitar entradas em maiúsculas ou minúsculas (ex: `c` ou `C`).

* **Saída Formatada**: Exibição do resultado arredondado para uma casa decimal utilizando `System.out.printf`.

## 🛠️ Conceitos Praticados

* Entrada de dados com a classe `Scanner`.

* Manipulação de strings (`toUpperCase()` e método `.equals()`).

* Operador ternário (`condition ? expr1 : expr2`) para tomada de decisão concisa.

* Formatação de saída numérica e caracteres especiais (`System.out.printf`).

* Boas práticas de fechamento de recursos (`scanner.close()`).

## 💻 Como Executar o Projeto

### Pré-requisitos

* **Java Development Kit (JDK)** instalado (versão 8 ou superior).

### Passo a passo

1. **Clone o repositório:**

   ```
   git clone https://github.com/evellyncsl/Conversor-de-Temperatura
   
   ```

2. **Navegue até o diretório do projeto:**

   ```
   cd Conversor-de-Temperatura
   
   ```

3. **Compile o arquivo Java:**

   ```
   javac Conversor-de-Temperatura
   
   ```

4. **Execute o programa:**

   ```
   java Conversor-de-Temperatura
   
   ```

## 📝 Exemplo de Uso

```
Digite a temperatura: 100
Converter para Celsius ou Fahrenheit (C/F): C
A temperatura convertida é: 37,8°C

```

📌 *Projeto desenvolvido apenas para treino e fixação da sintaxe básica do Java.*
