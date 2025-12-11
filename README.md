# Logger Lib

Biblioteca de geração de logs em formatos **CSV** e **JSONL**, desenvolvida para atender aos requisitos da disciplina de Projeto de Sistemas de Software (UFES).

Esta biblioteca foi projetada para ser importada externamente via **JitPack**, desacoplando a lógica de registro de eventos da aplicação principal.

## 📋 Requisitos

* Java 17
* Maven

## Instalação

Para utilizar esta biblioteca no seu projeto Maven, adicione o repositório do JitPack e a dependência no seu arquivo `pom.xml`.

### 1. Adicionar o repositório JitPack

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>[https://jitpack.io](https://jitpack.io)</url>
    </repository>
</repositories>
