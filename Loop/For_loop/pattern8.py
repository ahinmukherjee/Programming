# 5
# 4 4
# 3 3 3
# 2 2 2 2
# 1 1 1 1 1

n=5
for i in range(n):
    for j in range(i+1):
        print(n,'', end="")
    n=n-1
    print()