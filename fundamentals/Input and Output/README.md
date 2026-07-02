# Input\Output
An *Input*/*Output* mechanism is responsible for communication between the external world and a program. With *Input*, we receive data and send it to the program, while with *Output*, we can read what is produced by the program. They are fundamental to user-program communication.

## Input
Receive data from the external world and sends it to the program. In many cases, we need to convert the data type. The input command may vary depending on the programming language being used.

### Python
In Python, the `input()` function is commonly used, wich returns data as a string type (`str`). When another type is needed, we use conversion functions such as `int()`, `float()` or `bool()`. **Ex.:**  
> age = int(input("Please, enter your age: "))

### Java
In Java, the `Scanner` class is commonly used. It is commonly used in simple programs and when learning programming fundamentals. **Ex.:**
> System.out.print("Enter your age: ");  
int age = scanner.nextLine();

> 💡 **Nota:** Before calling `scanner.nextLine()`, you need to create a `Scanner` class object:  
Scanner scanner = new Scanner(System.in);

## Saída
Send data produced by program to external world, which can be a text, variable value or both. The ounput command may vary depending on the programming language being used.

### Python
In Python, the `print()` function are commonly used for output. There are two common ways to use print():
* **Simple:** Used to display plain text. **Ex.:** 
> print("Hello, my name is Davi.")  
**Output:**  
Hello, my name is Davi.
* **Formatted (*f-string*):** Allows text to be combined with variables and expressions using curly braces (*{}*). **Ex.:** 
> print(f"Hello, my name is {name}.")  
**Output:**  
Hello, my name is Davi.

### Java
In Java, the `print()`, `println()`, and `printf()` methods of the `System.out` class are commonly used to display output.
* **Basic:** The `print()` method displays text on the same line. This means that the next `print()` call continues from where the previous one ended. **Ex.:** 
> System.out.print("Hello, my name is ");  
System.out.print("Davi.");  
**Output:**  
Hello, my name is Davi.
* **Line break:** The `println()` method displays text with a line wrap. This means that the next `print()` call will start on a new line. **Ex.:** 
> System.out.println("Hello, my name is ");  
System.out.println("Davi.");  
**Output:**  
Hello, my name is  
Davi.
* **Formatted (*f-string*):** The `printf()` method displays text and variables together using format specifiers such as `%s` (String), `%d` (Integer), and `%f` (Floating-point). We can add a line break with `\n` in the end of sentence. **Ex.:** 
> System.out.printf("Hello, my name is %s \n", name);  
**Output:**  
Hello, my name is Davi.