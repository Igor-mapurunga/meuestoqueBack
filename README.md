# 🧾 Sistema de Gerenciamento de Estoque

Sistema backend desenvolvido em **Java + Spring Boot**, com persistência de dados em **PostgreSQL**, para controle de produtos em estoque. Ele fornece uma API RESTful completa com endpoints para cadastrar, listar, editar e excluir produtos, além de documentação interativa via Swagger.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 17  
- ✅ Spring Boot 3.2.x  
- ✅ Spring Data JPA  
- ✅ PostgreSQL  
- ✅ Swagger (Springdoc OpenAPI)  
- ✅ Maven  

---

## 📁 Estrutura de Diretórios

src/main/java/com/meuEstoque/estoque_app/
├── controller # Endpoints da API (ProdutoController)
├── model # Entidades JPA (Produto)
├── repository # Interfaces de repositório (ProdutoRepository)
├── service # Camada de regra de negócio (ProdutoService)
├── config # Configurações extras (Swagger)
└── EstoqueAppApplication.java
