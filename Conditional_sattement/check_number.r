numberCalculate <- function(n) {
  if (n > 0) {
    print("Number is Positive")
  } else if (n < 0) {
    print("Number is Negative")
  } else {
    print("Number is Equal")
  }
}

a <- as.integer(readline(prompt = "Enter value: "))
numberCalculate(a)
