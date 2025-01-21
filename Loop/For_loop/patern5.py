# 1
# 2 3
# 4 5 6
# 7 8 9 10

n=4
s=1
for i in range(n):
    for j in range(i+1):
        print(s,'',end='')
        s+=1
    print() 