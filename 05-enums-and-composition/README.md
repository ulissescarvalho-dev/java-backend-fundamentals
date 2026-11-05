# Módulo 05: Enumerações e Composição

Este módulo abrange a transição dos conceitos básicos de Orientação a Objetos para o design de sistemas mais desacoplados e expressivos, abordando o uso de **Enumerações (Enums)** e o princípio de **Composição de Objetos** em Java com base nos exercícios do curso do professor Nélio Alves.

---

## Tópicos Abordados

### 1. Enumerações (`enum`)
- Tipos de dados especiais para representação de constantes fixas e nomeadas (ex: `OrderStatus`, `WorkerLevel`).
- Conversão de tipos: parsing de `String` para `enum` com `valueOf()` e formatação inversa.
- Garante maior segurança de compilação (*type safety*) ao evitar valores inválidos no domínio.

### 2. Composição de Objetos
- Modelagem de relacionamentos do tipo **"tem-um"** (*has-a*).
- Associação entre classes para dividir responsabilidades e evitar o acoplamento excessivo trazido pela herança.
- Manipulação de coleções internas (listas de contratos, itens de pedidos) e delegação de cálculos para os objetos responsáveis.

---

## Princípios de Design Aplicados

- **Alta Coesão:** Cada entidade gerencia estritamente o seu estado e comportamento (ex: o cálculo do valor total do pedido é delegado à própria lista de itens do pedido).
- **Baixo Acoplamento:** As classes colaboram entre si através de suas interfaces públicas sem expor detalhes desnecessários da implementação interna.
- **Reutilização de Código:** Reutilização de objetos compostos em diferentes fluxos da aplicação sem necessidade de hierarquias complexas de classes.

