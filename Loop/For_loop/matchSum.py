s=22
n=int(input("enter number:"))
for i in range(n):
    for j in range(i,n):
        if(i+j==s):
            print(i,j)
        for k in range(j,n):
            if(i+j+k==s):
                print(i,j,k)