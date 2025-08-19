# Sistema PRW Project

Um sistema simples de gerenciamento de restaurantes e clientes, desenvolvido em Java, com funcionalidades como cadastro, visitação e votação de pratos preferidos.

## 📌 Sobre o Projeto

O **Sistema PRW** é uma aplicação console escrita em Java que simula a interação entre clientes e restaurantes. Os clientes podem visitar restaurantes, votar em seus pratos preferidos, e o sistema é capaz de identificar o prato mais votado(Melhor prato).

---

## 🧩 Funcionalidades

- Cadastro de **clientes** e **restaurantes**
- Registro de **visitas** de clientes a restaurantes
- Votação de **prato preferido** pelos clientes
- Listagem de visitantes por restaurante
- Identificação do **melhor prato** com base nos votos

---

## 💻 Tecnologias

- **Linguagem:** Java (versão 8 ou superior)
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Estrutura de dados:** `HashMap`, `ArrayList`

---

## 📂 Estrutura de Classes

### `Cliente.java`

Representa um cliente com:
- Nome
- Email (único)
- Prato preferido (com possibilidade de atualizar)

### `Restaurante.java`

Representa um restaurante com:
- Nome
- Prato escolhido
- Lista de clientes visitantes
- Quantidade de votos recebidos

### `SistemaPrw.java`

Classe principal (Controladora) que gerencia:
- Cadastro de clientes e restaurantes
- Visitação e votação
- Retorno de informações agregadas (melhor prato, clientes por restaurante)

---

## 🚀 Como Executar

**Clone o repositório:**
   ```bash
   git clone https://github.com/Antonio-Farias-Neto/Sistema_Prw-project.git
   cd Sistema_Prw-project
   ```
   
# Author
- Antonio Neto [GitHub](https://www.github.com/Antonio-Farias-Neto)
- projeto feito nas aulas de programação da UFCG.
