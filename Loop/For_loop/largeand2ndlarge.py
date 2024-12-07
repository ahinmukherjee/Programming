# large ans 2nd large
s=[10, 20, 30, 45, 21, 8]
for i in range(len(s)):
    for j in range(len(s)):
        if(s[i]>s[j]):
            temp=s[i]
            s[i]=s[j]
            s[j]=temp
print(s)
print("smallest is:", s[0], "2nd smallest is:", s[1])