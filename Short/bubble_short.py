def bubbleShort(n):
    for i in range(len(n)):
        for j in range(i+1,len(n)):
            if(a[i]>a[j]):
                a[i],a[j]= a[j],a[i]
    print(a)

a=[]
n=int(input("how many numbers you want"))
print("enters numbers")
for i in range(n):
    s=int(input())
    a.append(s)
bubbleShort(a)
