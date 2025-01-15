s=123
r=0
sum=0
while(s>0):
    r= s%10
    sum = sum*10+r
    s=s//10
print(sum)