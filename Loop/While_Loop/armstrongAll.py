n=int(input("enter range"))
c=len(str(n))
arm=0
while(n>0):
    r= n%10
    arm = arm+ (r**c)
    n=n//10
if(n==arm):
    print("arm is")
else:
    print("is not arm")
 