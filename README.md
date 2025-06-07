#authentic bilioteca

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![postgresql](https://img.shields.io/badge/postgresql-%23316192.svg?style=for-the-badge&logo=pstgresql&logoColor=white)
![dockercompose](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white)
![flyway](https://img.shields.io/badge/flyway-%23316192.svg?style=for-the-badge&logo=flyway&logoColor=pink)


# 📚 Biblioteca API

Esta é uma API REST construída como projeto de estudo com **Spring Boot** e **Spring Security**, com foco em autenticação e autorização baseada em **roles**. O objetivo é permitir que **apenas usuários com a role de `BIBLIOTECARIO`** possam cadastrar livros, enquanto usuários com a role de `LEITOR` podem visualizar a lista de livros.

## ⚙️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Security
- PostgreSQL
- Flyway (migrations)
- Docker & Docker Compose
- JPA / Hibernate

## 🧩 Funcionalidades

| Funcionalidade                | Role necessária     | Método | Endpoint              |
|------------------------------|---------------------|--------|-----------------------|
| Cadastrar um novo livro      | `BIBLIOTECARIO`     | POST   | `/livros`             |
| Listar todos os livros       | `LEITOR` ou superior| GET    | `/livros`             |
| Cadastrar usuários (em breve)| -                   | -      | -                     |
| Autenticação JWT (em breve)  | -                   | -      | -                     |

## 🔐 Controle de Acesso

A segurança é baseada em roles. Os usuários são autenticados (futuramente via JWT), e apenas os que têm a role adequada conseguem acessar determinados endpoints.

### Exemplos de roles:
- `BIBLIOTECARIO`
- `LEITOR`

## 🐘 Banco de Dados

O banco utilizado é **PostgreSQL**, com versionamento de schema feito pelo **Flyway**.

### Migrations automáticas:

As migrations são executadas automaticamente ao subir a aplicação, via Flyway, com scripts SQL organizados em:





