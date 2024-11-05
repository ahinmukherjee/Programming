n=int(input("enrte number"))
sum1=1
cal=0
x=1
for i in range(n):
    x=x+1
    cal=(n/x)
    print("calculate is",cal)
    sum1=sum1+cal
    print(sum1)
print("Addition of total number is",sum1)