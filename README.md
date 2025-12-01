# Day 23/30 — GraphQL API com Spring Boot

**#30DiasJava Challenge**

queries, mutations e subscriptions

## 📋 Sobre

Este projeto faz parte do desafio #30DiasJava, onde construímos 30 microserviços production-ready em 30 dias.

## 🚀 Tecnologias

- Java 21
- Spring Boot 3.4.0
- PostgreSQL
- Flyway
- OpenAPI/Swagger
- Testcontainers

## 📖 Artigo

Leia o artigo completo: [Day 23/30 — GraphQL API com Spring Boot](https://enouveau.io/blog/2025/11/23/GraphQL-API-com-Spring-Boot.html)

## 🏃 Como Executar

### Pré-requisitos

- Java 21
- Maven 3.9+
- PostgreSQL 16
- Docker (opcional, para Testcontainers)

### Configuração

1. Clone o repositório:
```bash
git clone https://github.com/adelmonsouza/30DiasJava-Day23.git
cd 30DiasJava-Day23
```

2. Configure o banco de dados:
```bash
# Criar database
createdb day23_db

# Ou via Docker
docker run -d --name postgres-day23 \
  -e POSTGRES_DB=day23_db \
  -e POSTGRES_USER=dev \
  -e POSTGRES_PASSWORD=dev \
  -p 5436:5432 \
  postgres:16
```

3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

4. Acesse:
- API: http://localhost:8080
- Swagger: http://localhost:8080/swagger-ui.html

## 🧪 Testes

```bash
./mvnw test
```

## 📚 Documentação

- [Artigo no Blog](https://enouveau.io/blog/2025/11/23/GraphQL-API-com-Spring-Boot.html)
- [Swagger UI](http://localhost:8080/swagger-ui.html)
- [API Docs](http://localhost:8080/api-docs)

## 🔗 Links

- [Blog #30DiasJava](https://enouveau.io/blog/)
- [Todos os Repositórios](https://github.com/adelmonsouza?tab=repositories&q=30DiasJava)

## 📝 Licença

Este projeto é parte do desafio #30DiasJava e é mantido para fins educacionais.

---

**#30DiasJava** | Construindo microserviços production-ready em 30 dias
