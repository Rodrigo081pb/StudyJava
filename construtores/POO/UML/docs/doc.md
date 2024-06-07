## UML

- Linguagem de modelagem Unificada ou como é chamada UML é uma notação que possibilita a representação gráfica do projeto.

- Na UML temos três conceitos para ser compreendidos

1° Diagramas
2° Elementos
3° Relacionamentos

- As notações UML são distribuídas em duas categorias de diagramas, a estrutural e comportamental conforme a listagem abaixo:

°*Diagramas Estruturais*

- Diagrama de classe: O Diagrama de Classes é utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sistema. Por esta característica, _este diagrama é considerado o mais importante para a UML_, pois axilia a maioria dos demais diagramas

°*Diagramas de objetos*

- Este diagrama representa os objetos existentes em um determinado instante ou fato na aplicação. Assim conseguimos ter uma perspectiva do estado de nossos objetos mediante a interação dos usuários no sistema

---

## Documentação

- [documentação](https://www.devmedia.com.br/uml-para-java/2711)

---

## Diagrama de classe

-- O diagrama de classes ilustra _graficamente_ como classes serão estruturadas e interligadas entre si diante da proposta do nosso software

Em diagrama a estrutura de classes é constituida por

-_Identificação:_ Nome e/ou finalidade da classe

-_Atributos:_ Propriedades e/ou características.

-*Operações:*Ações e/ou métodos

## Relacionamentos

- Em um diagrma as classes podem existir de forma independente, mas obviamente haverá em alguma etapa da aplicação e necessidade de algumas se relacionarem, o que devemos compreender é o nível de dependência entre elas:

- Associação

Uma associação define um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro projeto.

|CLASSE A| ----> |CLASSE B| - Associação Simples - Navegação de A para B.

|CLASSE A| <----> | CLASSE B| - Associação Bidirecional.

|CLASS A| <>----> | CLASS B| - Agregação

|CLASSE A| <->---> | CLASS B| - Composição

-_Agregação_

Em uma agregação a classe principal contém uma relação com outra classe mas ela pode existir sem a classe agregadora. imagina em um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam uma Profissão.

|Candidato|<>----> |Profissão|

-_Composição_

Diferente da agregação a composição já caracteriza uma dependência existencial entra a Classe principal ea classe associada. Imaginamos que uma Admissão só poderá existir contendo suas informações básicas e a composição do Candidato selecionado.

|Admissão| <->--->|Candidato|

-_Multipliciadade_

Nem sempre o relacionamento entre as classes será de _um para um_, um determinado cenário poderá exigir multiplicidades específicas conforme opções abaixo:

° 1. -> Representa uma associação _contendo um elemento_

° * . -> Representa uma associação *contendo uma lista de elementos

° 0..1 -> Representa uma associação _contendo zero ou um elemento_

° 0..* -> Representa uma associação *contendo zero ou uma lista de elementos

_Visibilidade_

- os atributos e métodos de uma classe podem receber níveis de visibilidade, e na uml existem símbolos que representam cada um deles.

° (+) Visibilidade pública.

° (#) Visibilidade protegida (muita associada com herança)

° (-) Visibilidade privada

_Representação_

| Identificação |
|********************\_\_********************|
| - atributoPrivado: int |
| # atributoProtegido: String |
| + atributoPublico: Double |
|********************\_\_********************|
| |
| + metodoSemRetorno() : void |
| + metodoComRetorno() : void |
| + metodoComParametro(param1: int : void) |
|********************\_\_********************|

            |
            |
            |-----> |ClasseGenerica|
             1..*

## Plataformas

_Astah Community_
_Canva_

---
