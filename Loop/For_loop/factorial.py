n=int(input("enter range"))
fact=1
for i in range(n):
    fact=fact*i
    i=i+1
    print(fact)
print("Addition of total factorial number is",fact)