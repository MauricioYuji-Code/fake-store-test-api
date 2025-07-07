# Projeto testes automatizados da API 'fake-store'

## Contexto geral

Este projeto contém testes automatizados para APIs REST utilizando **Rest Assured**, com foco em validação de endpoints, status codes, e dados de resposta.

## Objetivo
Validar através dos testes automatizados as principais funcionalidades de um E-Commerce, pare realização de teste regressivo.

## Projeto
* **src/main**: Contém os arquivos de configuração;
* **src/test**: Contém as classes de testes que serão executadas

## Recursos utilizados:

- Java SDK 17
- Junit
- Rest Assured
- Snakeyaml
- Hamcrest (matchers)

---

## Como configurar ambiente
* Java SDK - [Configuração](https://www.devmedia.com.br/instalacao-e-configuracao-do-pacote-java-jdk/23749)
* Faça o 'clone' do projeto;
* Abra o projeto com a IDE InteliJ ou uma de sua preferência.

---

## Como executar o projeto

Através de um terminal, executar o seguinte comando para realizar todos os testes implementados.

```bash
 ./gradlew test    