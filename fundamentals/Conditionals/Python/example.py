
print("Lets simulate a grading system")

grade = int(input("Enter the grade (0-100): "))  # input from user

match grade:
    case grade if 90 <= grade <= 100:
        print("Grade: A")
    case grade if 80 <= grade < 90:
        print("Grade: B")
    case grade if 70 <= grade < 80:
        print("Grade: C")
    case grade if 60 <= grade < 70:
        print("Grade: D")
    case grade if 0 <= grade < 60:
        print("Grade: F")
    case _:
        print("Invalid grade. Please enter a value between 0 and 100.")

if grade >= 90:
    print("Excellent work!")
elif grade >= 70:
    print("Good job!")
else:
    print("You need to improve.")