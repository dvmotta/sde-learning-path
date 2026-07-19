# Loop
Os loops são estruturas de controle que executam blocos de código repetidamente até uma determinada condição ser satisfeita ou até que todos os elementos de uma coleção sejam percorridos. Existem dois tipos principais, `while` e `for`.
## Tipos de loops
### While
O laço `while` repete enquanto  uma condição específica for verdadeira, geralmente utilizado quando não se sabe o número de vezes que a repetição será executada.

### For
Já o laço `for` executa o bloco um determinado número de vezes ou percorre todos os elementos em sequência, executando uma vez cada item ou elemento, geralmente utilizado quando você conhece o conjunto ou sabe o numero de vezes que deverá se repetir.
> 💡 **Nota:** Em Python, o `for` é utilizado principalmente para percorrer elementos de coleções. Em linguagens como Java, C e C++, ele também pode ser utilizado como um contador de repetições.

### Loop infinito
Um loop cuja condição nunca se torna `False` é chamado de **loop infinito**. Geralmente isso ocorre por erro de lógica, embora existam casos em que esse comportamento seja  intencional, como em servidores ou sistemas embarcados.

### Loop aninhado
É possível utilizar um loop dentro de outro, formando os chamados **loops aninhados** (*nested loops*). Essa técnica é comum quando é necessário percorrer estruturas bidimensionais, como matrizes.

### Comandos de controle de loop
* **Break:** Interrompe imediatamente a execução do loop.
* **Continue:** Interrompe a iteração atual e passa para a próxima.

> 💡 **Nota:** Python também possui a instrução `pass`, que representa um bloco vazio. Serve apenas como um espaço reservado quando nenhuma ação deve ser executada.
