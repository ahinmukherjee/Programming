# item=int(input("enter searching elements"))
s=[2,4,5,67,9,-9]
for i in range(len(s)):
    for j in range(len(s)):
        if(s[i]<s[j]):
            temp=s[i]
            s[i]=s[j]
            s[j]=temp
print(s)
item=int(input("enter searching elements"))
if(item in s):
    print("Searching elelments",item, "is found")
else:
    print("Searching elelments",item, "is not found")
