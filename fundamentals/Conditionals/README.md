# Conditionals
The conditional structures allow us to control a program's flow by conditionals. They evaluate the result of a logical expression, `True` or `False`, and different code blocks are executed.

## Type of structures

### Basic structures
* **If:** Evaluate a specific condition, if it returns `True`, then the corresponding code block is executed.
* **Elif / Else If:** Allows antoher condition to be evaluated if the previous one returned `False`, and if that one returns `True`, the corresponding code block is executed.
* **Else:** Execute a default code block which would execute if all previous conditions evauate to `False`.

### Multiple choice structures
* **Match/Switch:** Are conditional used to handle multiple cases, through the `case` keyword. In Python, we uses `match`, and in Java, we uses `switch`.Both can execute different code blocks depending on the value of an expression.

> 💡 **Note:** Although they are used for similar purposes, `match` (Python) and `switch` (Java) are not the same structure, `match` supports ***pattern matching***, offering more advanced features than `switch`.  
  
> 💡 **Pattern Matching:** Can compare ab expression expression against different patterns, it can also match complex data structures.