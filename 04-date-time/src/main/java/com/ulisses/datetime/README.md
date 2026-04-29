# 📅 Módulo: Java Date-Time API (Java 8+)

Este módulo contém uma exploração técnica da API moderna de data e hora do Java (`java.time`). O objetivo foi consolidar o conhecimento sobre manipulação de datas, fusos horários e cálculos temporais de forma imutável e segura.

## 🚀 Conceitos Chave

### 1. Tipos de Dados Temporais
- **LocalDate**: Representa uma data sem horário (ex: 2022-07-20). Ideal para aniversários ou datas festivas.
- **LocalDateTime**: Combina data e horário local, mas sem fuso horário (ex: 2022-07-20T10:30).
- **Instant**: Um ponto específico na linha do tempo global (UTC). Fundamental para logs de sistemas e persistência em banco de dados.

### 2. Formatação e Parsing
- Uso do `DateTimeFormatter` para converter strings ISO-8601 em objetos Java e vice-versa.
- Implementação de padrões customizados para a cultura brasileira (`dd/MM/yyyy`).

### 3. Gerenciamento de Fuso Horário (Timezone)
- Uso da classe `ZoneId` para converter um `Instant` (Global) em horários locais específicos.
- Entendimento de como o horário do sistema (`ZoneId.systemDefault()`) influencia na exibição dos dados.

### 4. Operações e Cálculos
- **Imutabilidade**: Aprendi que a API é imutável; métodos como `.plusDays()` ou `.minusHours()` retornam novas instâncias, evitando efeitos colaterais.
- **Duration**: Cálculo de intervalo entre dois momentos temporais. Necessidade de usar `.atStartOfDay()` ao comparar instantes com datas puras (`LocalDate`).

## 🛠️ Tecnologias Utilizadas
- **Java 17** (Temurin JDK)
- **Maven** (Gerenciamento de dependências e estrutura multi-módulo)
- **WSL/Ubuntu** (Ambiente de desenvolvimento e execução)
- **Git** (Versionamento semântico com Conventional Commits)

---
*Estudo realizado como parte do curso Java Completo (Programação Orientada a Objetos).*