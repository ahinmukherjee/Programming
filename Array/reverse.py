a=[10,22,33,32]
b=[]
k=0
for x in a:
    if(len(b)<0):
        b[k]=x
        k=k+1
    else:
        for j in range(k,0,-1):
            b[j]=b[j-1]
            b[j]=x
            k=k+1
# print(b)
print(x)
print(k)