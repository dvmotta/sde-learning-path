print("Welcome, what you wanto to do?" "\n"
"1. Print multiplication table until 10 (for loop)" "\n"
"2. Guess the number (while loop)" "\n"
)
choice = int(input("Enter your choice (1 or 2): "))

if choice == 1:
    print("Multiplication Table")
    numberTable = int(input("Enter a number: "))
    for i in range(1, 11):
        print(f"{numberTable} x {i} = {numberTable * i}")
    print("Multiplication table printed successfully.")

elif choice == 2:
    print("Guess the Number Game" "\n"
          "Guess a number between 1 and 10")
    number = 6
    guess = int(input("Enter your guess: "))
    while guess != number:
        print("Wrong guess! Try again.")
        guess = int(input("Enter your guess: "))

    print("Congratulations! You guessed the correct number.")

else:
    print("Invalid choice. Please select either 1 or 2.")