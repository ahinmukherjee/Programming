add_numbers <- function(a, b) {
  return(a + b)
}

subtract_numbers <- function(a, b) {
  return(a - b)
}

multiply_numbers <- function(a, b) {
  return(a * b)
}

divide_numbers <- function(a, b) {
  if (b == 0) {
    return("Error: Division by zero is not allowed.")
  }
  return(a / b)
}

# Taking user input
num1 <- as.numeric(readline("Enter first number: "))
num2 <- as.numeric(readline("Enter second number: "))

# Performing operations
sum_result <- add_numbers(num1, num2)
sub_result <- subtract_numbers(num1, num2)
mul_result <- multiply_numbers(num1, num2)
div_result <- divide_numbers(num1, num2)

# Displaying results
cat("Addition:", sum_result, "\n")
cat("Subtraction:", sub_result, "\n")
cat("Multiplication:", mul_result, "\n")
cat("Division:", div_result, "\n")

