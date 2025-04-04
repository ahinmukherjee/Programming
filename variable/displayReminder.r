calculate_remainder <- function(dividend, divisor) {
  if (divisor == 0) {
    return("Error: Division by zero is not allowed.")
  }
  return(dividend %% divisor)
}

# Taking user input
dividend <- as.numeric(readline("Enter the dividend: "))
divisor <- as.numeric(readline("Enter the divisor: "))

remainder <- calculate_remainder(dividend, divisor)
cat("The remainder when", dividend, "is divided by", divisor, "is:", remainder, "\n")