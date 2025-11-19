# Motivando - Java
- Projeto para passagem de conhecimentos básico em Java.

## Sumário do Curso

1. Variáveis, Operadores aritméticos e lógicos
2. Estruturas condicionais
3. Estruturas de repetição
4. Estrutura de dados
5. Métodos
6. Orientação a Objetos (OO)
7. Interação com Banco de Dados (BD)
8. Interação com arquivos

## Link do repositório

- https://github.com/AndradeHugo25/motivando-java

## Fluxo de trabalho

- O tutorial do fluxo de trabalho foi elaborado com base no GitLab.
Este projeto encontra-se em meu repositório no GitHub, mas o conceito do fluxo permanece o mesmo.
Tutorial disponível em `docs/Fluxo_de_trabalho.pptx`.

## Dependências principais

- Java 21+
- Maven
- Lombok (plugin)

## Observações

- Caso o maven não esteja configurado e usuário não seja admin, basta executar os comandos abaixo para adicionar
  o Maven ao PATH, definir o JAVA_HOME para o jdk desejado e priorizar o binário do jdk no PATH do sistema. Exemplo:
```
  $env:PATH += ";C:\Ferramentas\Maven\bin"
  $env:JAVA_HOME = "C:\Ferramentas\JDK21"
  $env:PATH = "$env:JAVA_HOME\bin;$env:PATH"
```
