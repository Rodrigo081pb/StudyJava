# Guia de Getters e Setters em Java

Getters e setters são usados para proteger seus dados, especialmente na criação de classes. Para cada instância de variável, um método getter retorna seu valor, enquanto um método setter o define ou atualiza. Com isso em mente, getters e setters também são conhecidos como métodos de acesso e de modificação, respectivamente.

## Convenções de Nomenclatura

Por convenção:

- Getters começam com a palavra `get` seguida do nome da variável com a primeira letra em maiúscula.
- Setters começam com a palavra `set` seguida do nome da variável com a primeira letra em maiúscula.

## Exemplo de Classe com Getters e Setters

```java
public class Vehicle {
  private String color;

  // Getter
  public String getColor() {
    return color;
  }

  // Setter
  public void setColor(String c) {
    this.color = c;
  }
}
```

No exemplo acima:

- O método getter `getColor` retorna o valor do atributo `color`.
- O método setter `setColor` recebe um parâmetro e o atribui ao atributo `color`.

## Uso de Getters e Setters no Método `main`

```java
public static void main(String[] args) {
  Vehicle v1 = new Vehicle();
  v1.setColor("Vermelho");
  System.out.println(v1.getColor());
  // O resultado é "Vermelho"
}
```

## Benefícios de Usar Getters e Setters

Getters e setters permitem controlar a forma como variáveis importantes são acessadas e atualizadas no seu código. Por exemplo, considere este método setter:

```java
public void setNumber(int number) {
  if (number < 1 || number > 10) {
    throw new IllegalArgumentException();
  }
  this.number = number;
}
```

Ao usar o método `setNumber`, você pode se certificar de que o valor de `number` está sempre entre 1 e 10. Isso é muito melhor do que atualizar a variável `number` diretamente:

```java
obj.number = 13;
```

Se você atualizar `number` diretamente, pode causar efeitos colaterais indesejados em outros pontos do seu código. Definir `number` com o valor de 13 violaria a restrição de que o número precisa estar entre 1 e 10.

Tornar `number` uma variável privada e usar o método `setNumber` evita que isso aconteça.

## Leitura do Valor Usando um Getter

A única maneira de ler o valor de `number` é usando um método getter:

```java
public int getNumber() {
  return this.number;
}
```

## Conclusão

Getters e setters são fundamentais para encapsular dados e garantir que as variáveis sejam acessadas e modificadas de maneira controlada e segura. Eles ajudam a manter a integridade dos dados e a evitar comportamentos inesperados no seu código.
