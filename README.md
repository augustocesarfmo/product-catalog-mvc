# Product catalog MVC

Este repositório contém dois projetos que demonstram a aplicação da arquitetura MVC em um sistema de catálogo de produtos:

- `/product-catalog-mvc`: Exemplo de aplicação da arquitetura MVC em um sistema **baseado em terminal**.
- `/product-catalog-mvc-web`: Exemplo de aplicação da arquitetura MVC em um sistema **baseado na web**.

## 🚀 Tecnologias

Este projeto foi desenvolvido para portfólio com as seguintes tecnologias:

- [java](https://www.java.com/pt-BR/)
- [spring-boot](https://spring.io/projects/spring-boot)

## ℹ️ Executando

Para clonar e executar os projetos, você precisará ter instalado no seu computador:

- [Git](https://git-scm.com);
- [Java v23.0.1](https://nodejs.org/) ou superior; e
- [Apache Maven v3.9.9](https://maven.apache.org/) ou superior.

Na sua linha de comando execute:

```bash
# Clonando este repositório
$ git clone https://github.com/augustocesarfmo/product-catalog-mvc.git

# Acessando o repositório
$ cd product-catalog-mvc
```

### Executando `product-catalog-mvc` (aplicação de terminal)

```bash
# Acessando o app
$ cd product-catalog-mvc

# Compilando o app
$ javac Main.java

# Executando o app
$ java Main
```

### Executando `product-catalog-mvc-web` (aplicação web)

```bash
# Acessando o app
$ cd product-catalog-mvc-web

# Compilando o app
$ mvn compile

# Executando o app
$ mvn spring-boot:run

# Consumindo a API
  1. Instale a extensão REST Client no VS Code;
  2. Abra o arquivo './client.http';
  3. Clique em 'Send Request' em uma das rota
```

## 📝 Licença

Este projeto está sob a licença MIT. Consulte a [LICENÇA](https://github.com/augustocesarfmo/product-catalog-mvc/blob/main/LICENSE.md) para obter mais informações.

---

by Augusto César Oliveira 👐🏼
