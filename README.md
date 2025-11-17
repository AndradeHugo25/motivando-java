# Motivando - Java
- Projeto para passagem de conhecimentos básico em Java.

## Link do repositório

- https://github.com/AndradeHugo25/motivando-java

## Fluxo de trabalho

- O tutorial do fluxo de trabalho foi feito baseando-se no gitlab. 
Este projeto encontra-se em meu repositório no github, mas o conceito do fluxo é o mesmo.
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