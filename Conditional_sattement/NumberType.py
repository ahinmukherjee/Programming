class Number:
    def number_calculate(self, n):
        if n > 0:
            print("Number is Positive")
        elif n < 0:
            print("Number is Negative")
        else:
            print("Number is Equal")

a = int(input("Enter value: "))
nb = Number()
nb.number_calculate(a)