# find numbers where number is squre of number

n=[]
i=1
while(i<=7):
    for k in range(1,51):
        a=k**2
        if(a<=50):
            n.append(a)
            i+=1
print(n)
