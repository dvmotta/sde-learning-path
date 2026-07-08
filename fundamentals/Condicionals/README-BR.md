# Condicionais
As estruturas condicionais permitem controlar o fluxo de um programa por meio da avaliação de condições. Dependendo do resultado de uma expressão lógica (`True` ou `False`), diferentes blocos de código podem ser executados.

## Tipos de estruturas

### Estruturas básicas
* **If:** Avalia uma condição específica e caso retorne `True`, o bloco de código é executado.
* **Elif / Else If:** Permite avaliar outra condição caso a anterior retorne `False`, e se essa retornar `True`, outro bloco de código é executado.
* **Else:** Define um bloco de código que será executado quando nenhuma das condições anteriores retornar `True`.

### Estruturas de múltipla escolha
* **Match/Switch:** Estrutura condicional de múltipla escolha utilizada em conjunto com o comando `case`. Em Python utiliza-se `match`, enquanto em Java utiliza-se `switch`. Ambos permitem executar diferentes blocos de código de acordo com o valor de uma expressão.  

> 💡 **Nota:** Apesar de possuírem propósitos parecidos, `match` (Python) e `switch` (Java) não são exatamente a mesma estrutura, o `match` suporta ***pattern matching***, oferecendo recursos mais avançados que o `switch`.  
  
> 💡 **Pattern Matching:** Permite comparar uma expressão com diferentes padrões, possibilitando analisar também a estrutura dos dados.