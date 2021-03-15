# Objetivo
API autenticação basic com Spring Boot.

## Iniciando

- `git clone https://github.com/sergio-aliceral/autenticacao-basic.git`
- `cd autenticacao-basic`

## Pré-requisitos
- `mvn --version`<br>

Você deverá ver a indicação da versão do Maven instalada e a versão do JDK. Observe que o JDK é obrigatório, assim como a definição das variáveis de ambiente **JAVA_HOME** e **M2_HOME**.

## Limpar, compilar e empacotar
- `mvn clean install`<br>

Gera arquivo _crud-1.0.jar_ no diretório _target_.

## Executando a aplicação
- `java -jar target/autenticacao-basic-1.0.0.jar`<br>

Executa o aplicativo por meio do arquivo jar criado pelo comando `mvn clean install`, conforme comentado anteriormente.

### Endpoints

- Hello World: `GET` http://localhost:8080/hello
- Lista as pessoas: `GET` http://localhost:8080/pessoa
