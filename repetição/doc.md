## Estrutura de repetição

Laçõs de repetição || laços de iteração || loops

Temos alguns tipos

° For (Para)
° While (enquanto)
° Do While (Faça enquanto)

---

O for = Para

Permitew que uma váriavel contadora seja _Testada_
a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição eo valor de incrementação.

A estrutura de sintaxe do controle de repetição _for_ é exibida :

segue estrutura _FOR_

---

## No exemplo do aquivo "ExemploForArray"

° Podemos ver o uso do : no código segue abaixo

       for (String aluno : alunos) {
           System.out.println("O nome do aluno é: " + aluno);
       }

- O uso do : é feito para separar uma váriavel temporária de um bloco de códigos. no exemplo acima á variável temporaria é "aluno" e o array indicado é "Alunos" o : vai iterar toda a estrutura de código por exemplo

  int numbers [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}

  for (int number : numbers){
  System.out.println("É :" + number)
  }

  // O bloco acima irá contar de 1 até 20.

---

Break e continue

- Break significa quebrar ou parar, e é isso que se quandos quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele "Continua" o laço. O comando break interrompe o laço, Já o continue interrompe somente a iteração atual.

Exemplo abaixo pra contar de 1 até 20 utilizando loops Externos e internos

Nessa estrutura de código ele vai executar o loop interno até ser < 100 ele vai executar inicialmente o contador externo ou seja ele vai mostrar em qual indice ele está sendo contado a partir do 0 até ser < 100 e ocontador do loop interno também vai ser contado no caso exibido que está sendo pulado de 2 em dois ou seja vai começar no 0 e vai de 2 em 2 - 0 2 4 6 8 10... e por ai vái porém ele vai ser quebrado assim que chegar no 50 como mostrado no trecho de código

se j == 50 então para
if(j == 20) break;

apos finalizar o código vai exibir obviamente o contador

System.out.println()

e após sair do trecho de código vai exibir uma mensagem.

System.out.println("Contagem finalizada... :/")

/

// Loop Externo
for (int i = 0; i < 100; i++) {
System.out.println("Contador do loop externo: " + i);
System.out.print(" Contador do loop interno: ");

// O loop Interno
for (int j = 0; j <= 100; j += 2) {
System.out.print(j + " ");

    // Finaliza o Loop se j = 50
    if (j == 50) break;

}
System.out.println(); // Apenas pula uma linha
}

System.out.println("Contagem finalizada... :/");

// Documentacão

https://tecnologiaeinformacao.netlify.app/java/break-e-continue
