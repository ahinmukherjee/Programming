# large and 2nd small value
s=[10, 20, 30, 45, 21, 8]
for i in range(len(s)):
    for j in range(len(s)):
        if(s[i]<s[j]):
            temp=s[i]
            s[i]=s[j]
            s[j]=temp
print("largest is:", s[-2], "smallest is:", s[1])
