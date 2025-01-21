n=int(input("enter range:"))
c=n
arm=0
while(n>0):
    r= n%10
    arm = (arm*10)+r
    n=n//10
if(c==arm):
    print("palindrom")
else:
     print("palindrom not")
 
