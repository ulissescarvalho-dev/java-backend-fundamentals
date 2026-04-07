# Java Backend Fundamentals

Repositório de estudos estruturado com foco na construção de fundamentos sólidos em Java, programação orientada a objetos (POO) e organização de projetos com boas práticas utilizadas no desenvolvimento backend.

O objetivo deste projeto é consolidar conhecimentos de forma progressiva, organizando exercícios e exemplos práticos em uma estrutura modular que simula um ambiente mais próximo do desenvolvimento real.

---

## 🎯 Objetivo

Este repositório foi criado para:

* Praticar lógica de programação com Java
* Evoluir gradualmente em programação orientada a objetos
* Aplicar organização de código seguindo padrões profissionais
* Familiarizar-se com ferramentas e ambiente de desenvolvimento usados no mercado

---

## 🚀 Tecnologias e Ambiente

* **Linguagem:** Java 17 (LTS)
* **Build & Dependências:** Maven
* **Ambiente:** Linux (Ubuntu via WSL2)
* **Gerenciamento de versão do Java:** SDKMAN
* **IDE:** IntelliJ IDEA

---

## 🏗️ Estrutura do Projeto

O projeto segue o padrão do Maven e está organizado em módulos separados por tipo de conteúdo estudado:

```
java-backend-fundamentals/
├── logic-fundamentals/
│   └── src/main/java/com/ulisses/logic/
│       ├── sequential/      # Estruturas sequenciais
│       ├── conditionals/    # Estruturas condicionais
│       └── repetition/      # Estruturas de repetição
│
├── oop-introduction/
│   └── src/main/java/com/ulisses/
│       ├── bank/            # Exercícios de POO (conta bancária, etc.)
│       └── geometry/        # Exercícios com classes e métodos
│
└── pom.xml
```

A separação em módulos facilita a organização dos estudos e o isolamento de conceitos, permitindo evolução contínua sem comprometer a estrutura do projeto.

---

## 📈 Progresso de Estudos

* [x] Estruturas sequenciais
* [x] Estruturas condicionais
* [x] Estruturas de repetição
* [x] Introdução à Programação Orientada a Objetos
* [ ] Encapsulamento
* [ ] Construtores avançados
* [ ] Herança
* [ ] Polimorfismo
* [ ] Tratamento de exceções

---

## ▶️ Como executar

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/java-backend-fundamentals.git
cd java-backend-fundamentals
```

Compile o projeto com Maven:

```bash
mvn clean install
```

Execute uma classe específica (exemplo):

```bash
cd oop-introduction
mvn exec:java -Dexec.mainClass="com.ulisses.bank.Main"
```

> ⚠️ Ajuste o nome da classe conforme o exercício que deseja executar.

---

## 💡 Exemplos de Exercícios

### 🏦 Sistema de Conta Bancária

Simulação simples de criação de conta, depósito e saque.

**Entrada:**

```
Nome: João
Depósito inicial: 100.00
```

**Saída:**

```
Conta criada com saldo: 100.00
Novo saldo após depósito: 150.00
Novo saldo após saque: 130.00
```

---

### 📐 Cálculo de Área (Geometria)

Exercícios utilizando classes, atributos e métodos para cálculo de áreas geométricas.

Exemplo de aplicação:

* Cálculo de área de retângulo
* Cálculo de área de triângulo
* Uso de métodos para encapsular regras de negócio

---

## 🧠 Abordagem de Estudo

* Organização por módulos para separar conceitos
* Código simples, porém bem estruturado
* Foco em clareza e legibilidade
* Evolução incremental (do básico ao intermediário)
* Separação de responsabilidades por contexto

---

## 🔧 Próximos Passos

* Implementar conceitos avançados de POO
* Adicionar tratamento de exceções
* Introduzir testes automatizados com JUnit
* Evoluir para entrada de dados mais realista (Scanner / arquivos)
* Iniciar integração com banco de dados usando JDBC
* Criar um projeto backend real (API REST com Spring Boot)

---

## 📌 Observações

Este projeto faz parte de um processo contínuo de aprendizado.

A estrutura, organização e complexidade dos exercícios serão evoluídas progressivamente conforme o avanço nos estudos, com o objetivo de transformar este repositório em uma base sólida para desenvolvimento backend em Java.

---

## 📎 Autor

Desenvolvido como parte de um plano estruturado de evolução em Java, Git e Linux, com foco em preparação para oportunidades profissionais na área de desenvolvimento backend.
