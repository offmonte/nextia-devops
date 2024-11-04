# Grupo NEXTIA

## Descrição do Projeto

O projeto NEXTIA é um sistema de fidelidade integrado a um aplicativo móvel, permitindo que os clientes acumulem pontos em suas compras. Esses pontos podem ser trocados por descontos e brindes, incentivando a lealdade e contribuindo para o aumento do ticket médio das vendas. Além disso, a solução oferece uma interface prática e intuitiva para a gestão do programa de fidelidade, facilitando a análise de dados de vendas e auxiliando na tomada de decisões estratégicas.

---

## Testes da API

Aqui estão alguns schemas para testar a API no swagger

### Clientes

```json
{
    "id": 1,
    "nome": "Julia",
    "cpf": "56842367104",
    "email": "julia@gmail.com",
    "senha": "12345",
    "genero": "feminino",
    "dt_nascimento": "2003-06-24",
    "telefone": "551199789664319",
    "pontos": 0,
    "fidelidade": "NÃOFILIADO"
}
```

```json
{
    "id": 2,
    "nome": "Bia",
    "cpf": "56842367104",
    "email": "bia@gmail.com",
    "senha": "1234",
    "genero": "feminino",
    "dt_nascimento": "2003-06-24",
    "telefone": "55119975864319",
    "pontos": 200,
    "fidelidade": "FILIADO"
}
```

### Produtos
```json
{
    "id": 1,
    "nome": "Arroz",
    "categoria": "grãos",
    "valor": 45.99
}
```

```json
{
    "id": 2,
    "nome": "Feijão",
    "categoria": "grãos",
    "valor": 12.49
}
```


### Recompensas


```json
{
    "idRecompensa": 10,
    "tipoRecompensa": "Desconto",
    "descricao": "Desconto de 20% em compras acima de R$100",
    "dataResgate": "2024-11-03T12:00:00Z",
    "cliente": {
        "id": 2,
        "nome": "Bia",
        "cpf": "56842367104",
        "email": "bia@gmail.com",
        "senha": "1234",
        "genero": "feminino",
        "dt_nascimento": "2003-06-24",
        "telefone": "55119975864319",
        "pontos": 200,
        "fidelidade": "FILIADO"
    }
}
```

```json
{
    "idRecompensa": 11,
    "tipoRecompensa": "Produto",
    "descricao": "Caneca exclusiva"
}
```

## Endpoints da API

Os endpoints podem ser acessados utilizando os link abaixo

https://nextia.azurewebsites.net/swagger-ui/index.html

Caso deseje rodar a API localmente:

http://localhost:8080/swagger-ui/index.html#/

## Integrantes
Bianca Barreto - RM551848

Julia Akemi - RM98032

Lucas Monte - RM551604

Mateus Fattori - RM97904

Pedro Baraldi - RM98060


