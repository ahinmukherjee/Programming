calculate_power <- function(base, exponent) {
  return(base ^ exponent)
}

base <- as.numeric(readline("Enter the base number: "))
exponent <- as.numeric(readline("Enter the exponent: "))

result <- calculate_power(base, exponent)

cat(base, "raised to the power of", exponent, "is:", result, "\n")
