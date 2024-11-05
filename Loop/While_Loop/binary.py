n=int(input("enter number"))
add=0
bin=0
r=0
while(n>0):
    r=n%2
    bin=(bin*10)+r
    n=n//2
print(bin)
