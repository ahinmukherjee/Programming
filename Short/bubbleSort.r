bubble_sort <- function(arr) {
  n <- length(arr)
  for (i in 1:n) {
    for (j in (i+1):n) {
      if (arr[i] > arr[j]) {
        temp <- arr[i]
        arr[i] <- arr[j]
        arr[j] <- temp
      }
    }
  }
  return(arr)
}

# Taking user input
n <- as.integer(readline("How many numbers do you want? "))
arr <- numeric(n)

cat("Enter numbers:\n")
for (i in 1:n) {
  arr[i] <- as.integer(readline())
}

sorted_arr <- bubble_sort(arr)
cat("Sorted Array:", sorted_arr, "\n")