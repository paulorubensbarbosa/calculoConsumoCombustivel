# API Calculo de consumo de combustível consumindo API do google maps

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

Esse projeto é uma API construída usando Java e Java Spring, utilizando também a API do google Maps

## Problema
A API foi desenvolvida para calcular e exibir o consumo de combustível necessário para ir de um ponto à outro.

## Solução
A API espera receber do usuário as informações: Ponto de origem, Ponto de destino, Autonomia do carro em Km/l e Preço do Combustível.
através destas informações é feita uma requisição à API do GOOGLE MAPS para calcular a distância em KM entre os dois pontos, com essa informação,
é feito o calculo de quanto é o gasto em combustível nessa viagem.

## API Endpoint
```markdown
GET /distance/{origem}/{destino}/{autonomia}/{precoGasolina}
```
## Link para testar a API
```markdown
https://calculoconsumocombustivel.onrender.com/
```
Exemplos de uso:
```markdown
https://calculoconsumocombustivel.onrender.com/distance/Rua+das+Pedras,Buzios,RJ/Avenida+Boa+Vista,Recife,PE/12/5
```
## 
```markdown
https://calculoconsumocombustivel.onrender.com/distance/Recife,PE/Sao+Paulo,SP/12/5.8
```
Resposta aguardada:
```json
{
  "origem": "Recife,PE",
  "destino": "Sao+Paulo,SP",
  "distancia": 2644.853,
  "kmPorLitro": 12,
  "precodoLitro": 5.8,
  "valorDaViagem": 1278.34
}
```


## Objetivo
este é um projeto desenvolvido a fim de aprimorar meu portfólio e mostrar meus conhecimentos.

## Qualquer sugestão, crítica ou oportunidade de trabalharmos juntos, contate : 
## paulorubensbarbosa@outlook.com
