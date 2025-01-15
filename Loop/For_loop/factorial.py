n=int(input("enter range"))
fact=0
for i in range(n):
    fact=i**i
    i=i+1
    print(fact)
print("Addition of total factorial number is",fact)