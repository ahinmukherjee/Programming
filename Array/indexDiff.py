#two lists differents bettween index
n=[11, -4, 9, 45]
s=[9, 23, 10, 9]
d=[]
for i in range(len(n)):
    for j in range(len(s)):
        d=n[i]-s[j]
        print(d, ' ',end=' ')
    print() 