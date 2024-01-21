# Desafio: CRUD de Clientes

## Visão Geral
Projeto Spring Boot contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas: Busca paginada de recursos, Busca de recurso por id, Inserir novo recurso, Atualizar recurso, Deletar recurso.

### Funcionalidades Implementadas
O projeto inclui as seguintes operações básicas:

1. Busca paginada de recursos
2. Busca de recurso por id
3. Inserir novo recurso
4. Atualizar recurso
5. Deletar recurso

### Modelo de Cliente
A entidade `Client` possui os seguintes atributos:

- Nome
- CPF
- Renda
- Data de Nascimento
- Quantidade de Filhos

## Configuração e Execução

### Requisitos
- Spring Boot
- Maven
- Java
- Banco de dados H2

### Passos
1. Clone o repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Navegue até o diretório do projeto: `cd seu-repositorio`
3. Execute o projeto: `mvn spring-boot:run`

O servidor estará disponível em `http://localhost:8080`.

## Uso

### Exemplos de Requisições

#### Busca Paginada de Clientes
```http
GET /clientes?page=0&size=10
```
#### Busca de Cliente por ID
```http
GET /clientes/{id}
```
#### Inserir Novo Cliente
```http
POST /clientes
Content-Type: application/json

{
  "nome": "Nome do Cliente",
  "cpf": "123.456.789-00",
  "renda": 5000.00,
  "dataNascimento": "1990-01-01",
  "quantidadeFilhos": 2
}
```
#### Atualizar Cliente Existente
```http
PUT /clientes/{id}
Content-Type: application/json

{
  "nome": "Novo Nome",
  "renda": 6000.00
}
```
#### Deletar Cliente

```http
 DELETE /clientes/{id}
```

## Tratamento de Exceções
### O projeto trata as seguintes exceções:

Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
Erro de validação, retornando código 422 e mensagens customizadas para cada campo inválido.


Regras de validação:

Nome: não pode ser vazio.
Data de nascimento: não pode ser data futura (utilizando a anotação @PastOrPresent).












