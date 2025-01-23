def large(a,b,c):
    if(a<b and a>c):
        print(a," is large")
        print(c," is small")
    elif(b<c and b>a):
        print(b," is large")
        print(a," is small")
    else:
         print(c," is large")
         print(b," is small")
d=20
f=-29
h=30
large(d,f,h)