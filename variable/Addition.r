add_numbers <- function(a, b) {
  return(a + b)
}

num1 <- as.numeric(readline("Enter first number: "))
num2 <- as.numeric(readline("Enter second number: "))

result <- add_numbers(num1, num2)

cat("The sum is:", result, "\n")

