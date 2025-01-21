#   1
#  1 1
# 1 2 1

n=4
for i in range(n):
    for j in range(n-i):
        print()
    s=11**i
    while(s!=0):
            r=s%10
            print(r,'',end="")
            s=s//10
   