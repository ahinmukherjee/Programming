# [12, 4, 2, 3, -9, 6, 5, -2]

# out: [-9, -2, 12, 4, 2, 3, 6, 5]

n=[12, 4, 2, 3, -9, 6, 5, -2]
j=0
for i in range(len(n)):
    if(n[i]<0):
        temp=n[i]
        n[i]=n[j]
        n[j]=temp
        j+=1
print(n)