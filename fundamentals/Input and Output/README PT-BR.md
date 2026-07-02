# Entrada e saída
Entrada e saída (*Input*/*Output*) são os mecanismos responsáveis pela comunicação entre o programa e o ambiente externo. Por meio deles, é possível receber dados (*Input*) e apresentar informações (*Output*), sendo fundamentais para a interação com o usuário e com outros sistemas.

## Entrada
Responsável por receber dados do ambiente externo para que possam ser utilizados pelo programa. Em muitos casos, os dados precisam ser convertidos para um tipo específico antes de serem processados. Os comandos utilizados variam de acordo com a linguagem escolhida.

### Python
Em Python, a entrada é normalmente realizada pela função `input()`, que retorna os dados no formato de texto (`str`). Quando outro tipo de dado é necessário, utilizamos funções de conversão como `int()`, `float()` ou `bool()`. **Ex.:**  
> idade = int(input("Favor, insira sua idade: "))

### Java
Em Java, a entrada mais comum é realizada através da classe `Scanner`, amplamente utilizada em programas simples e no aprendizado dos fundamentos da linguagem. **Ex.:**

> System.out.print("Insira sua idade: ");  
int idade = scanner.nextLine();

> 💡 **Nota:** Antes de utilizar `scanner.nextLine()`, é necessário criar um objeto da classe `Scanner`:  
Scanner scanner = new Scanner(System.in);

## Saída
Responsável por enviar dados produzidos pelo programa para o ambiente externo, podendo conter texto puro, um valor de variavel ou misturar ambos. Seus comandos variam de acordo com a linguagem usada, um exemplo prático:  

### Python
Em Python, a saída é normalmente realizada através da função `print()`, que pode ser utilizada de duas maneiras:
* **Simples:** Utilizada apenas para impressão de textos simples. **Ex.:** 
> print("Olá, me chamo Davi.")  
**Resultado:**  
Olá, me chamo Davi.
* **Formatado (*f-string*):** Capaz de misturar textos simples com variáveis e expressões diretamente usando chaves (*{}*). **Ex.:** 
> print(f"Olá, me chamo {nome}.")  
**Resultado:**  
Olá, me chamo Davi.

### Java
Já em Java, a saída é geralmente realizada através dos métodos `print()`, `println()` e `printf()` da classe "*System.out*".
* **Básico:** Utilizando o comando `print`() temos um texto simples que se mantém na mesma linha e o próximo texto começará na mesma linha que ele. **Ex.:** 
> System.out.print("Olá, me chamo ");  
System.out.print("Davi.");  
**Resultado:**  
Olá, me chamo Davi.
* **Quebra de linha:** Utilizando o comando `println`() temos um texto com quebra de linha automática e o próximo texto começa na linha de baixo. **Ex.:** 
> System.out.println("Olá, me chamo ");  
System.out.println("Davi.");  
**Resultado:**  
Olá, me chamo  
Davi.
* **Formatado:** Utilizando o comando `printf`() podemos misturar um texto simples com valores de variáveis utilizando %s (no caso caso de string). Conseguimos inserir a quebra de linha com `\n` no fim da linha. **Ex.:** 
> System.out.printf("Olá, me chamo %s \n", nome);  
**Resultado:**  
Olá, me chamo Davi.