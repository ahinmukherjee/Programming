y=4
for i in range(y):
    s=11**i
    while(s!=0):
        r=s%10
        print(r,'', end="")
        s=s//10
    print()