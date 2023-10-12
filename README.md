# README - API de Texto para Localização em Java

Este projeto é uma API Java que tem como objetivo converter informações de texto em coordenadas geográficas (latitude e longitude). Isso pode ser útil para integrar a capacidade de geolocalização em aplicativos ou plataformas que requerem esse tipo de funcionalidade.

## Funcionalidades

- **Conversão de Texto em Localização:** Esta API aceita uma solicitação com um endereço em formato de texto e retorna as informações de localização correspondentes, incluindo bairro, cidade, região, latitude e longitude.

## Tecnologias Utilizadas

Este projeto utiliza as seguintes tecnologias:

- [Spring Boot](https://spring.io/projects/spring-boot): Estrutura de aplicativo Java baseada em Spring que facilita a criação de aplicativos autônomos.

- [RestTemplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html): Uma classe do Spring Framework usada para fazer solicitações HTTP a serviços RESTful.

- [Jackson](https://github.com/FasterXML/jackson): Biblioteca para trabalhar com JSON em Java, usada para analisar a resposta da API de mapeamento.

## Uso da API

Para usar esta API, siga as etapas abaixo:

1. **Inicie a Aplicação:** Inicie a aplicação executando a classe `TextInLocationApplication` no pacote `com.leofulco.textInLocation`. A API será iniciada na porta padrão 8080.

2. **Faça uma Solicitação GET:** Use um cliente HTTP, como o [Postman](https://www.postman.com/) ou `curl`, para fazer uma solicitação GET para o endpoint `/location` com um parâmetro de consulta `address`. Por exemplo:

```
GET http://localhost:8080/location?address=SeuEnderecoAqui
```

3. **Resposta da API:** A API irá processar a solicitação, converter o endereço em informações de localização e retornar uma resposta no formato JSON contendo o bairro, cidade, região, latitude e longitude.

```json
{
  "bairro": "Nome do Bairro",
  "cidade": "Nome da Cidade",
  "regiao": "Nome da Região",
  "latitude": 123.456789,
  "longitude": -45.678901
}
```

## Contribuições

Este é um projeto de código aberto, e contribuições são bem-vindas. Sinta-se à vontade para contribuir com melhorias no código, adicionar novos recursos ou resolver problemas.

## Autores

- Leandresson Fulco (devleofulco@gmail.com)

## Agradecimentos

Agradecemos a todos os desenvolvedores e entusiastas da programação que tornaram este projeto possível, bem como à comunidade de código aberto.

Este projeto tem como objetivo demonstrar boas práticas de desenvolvimento de APIs, uso de estruturas de dados eficientes e aplicação dos conceitos de Clean Code e padrões REST. Divirta-se usando a API de Texto para Localização em Java!
```
