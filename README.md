# 🛒 E-commerce API

API REST desenvolvida em **Java** para simular o backend de um sistema de e-commerce.  
O projeto segue uma **arquitetura em camadas**, aplicando boas práticas de desenvolvimento e organização de código.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de dados **H2 (em memória)**
- Maven

---

## 📌 Funcionalidades

- CRUD completo de entidades (ex: produtos, clientes, pedidos)
- Cadastro e listagem de produtos
- Gerenciamento de clientes
- Criação e consulta de pedidos
- Integração com banco de dados usando **JPA**
- Persistência em banco H2
- Estrutura preparada para fácil evolução do sistema

---

## 🏗️ Arquitetura

O projeto segue o padrão de **arquitetura em camadas**, organizado em:

- **Controller** → Responsável pelas requisições HTTP
- **Service** → Regras de negócio
- **Repository** → Acesso ao banco de dados (JPA)
- **Entity** → Modelos de dados

Essa estrutura facilita a manutenção, escalabilidade e organização do código.

---

## 🗄️ Banco de Dados

- Utiliza **H2 Database** (em memória)
- Console disponível em:  
  `http://localhost:8080/h2-console`

---

## ▶️ Como executar o projeto

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Acessar a pasta
cd nome-do-projeto

# Executar a aplicação
./mvnw spring-boot:run
