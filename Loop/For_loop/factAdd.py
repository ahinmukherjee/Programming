n=int(input("enter range"))
add=0
add1=0
for i in range(n):
    add=i**i
    add1=add1+add
    print(add1)
print("Addition of total factorial number is",add1)