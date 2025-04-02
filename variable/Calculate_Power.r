calculate_power <- function(base, exponent) {
  return(base ^ exponent)  # Using ^ operator for exponentiation
}

# Taking user input
base <- as.numeric(readline("Enter the base number: "))
exponent <- as.numeric(readline("Enter the exponent: "))

# Calculating power
result <- calculate_power(base, exponent)

# Displaying result
cat(base, "raised to the power of", exponent, "is:", result, "\n")
