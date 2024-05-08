## Estruturas excepcionais

_Exceções_

- Ao executar o código java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançara uma exceção (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente.

_Quando uxamos exceções usamos um fluxo inesperado da nossa aplicação por exemplo :_

- Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários e os demais não são erros mais sim fluxos não previsíveis pela aplicação.

É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que chamamos de Tratamentos de Exceções

_Hirarquia das exceções_

- A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquida denonimada de _Checked and Unchecked Exceptions_ ou Exceções Checadas e não checadas

_Documentação De tratamento de Exceções :_

-https://www.devmedia.com.br/tratando-excecoes-em-java/25514-
