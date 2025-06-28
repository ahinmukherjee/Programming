# user input

def selection_short(n):
    for i in range(len(n)):
        minIndex=i
        for j in range(i+1,len(n)):
            if(n[i]>n[j]):
                minIndex=j
                n[i],n[minIndex]=n[minIndex],n[i]
n=[]
no=int(input("Enter range"))
for i in range(no):
    s=int(input())
    n.append(s)
selection_short(n)
print("Shorting List is:",n)
