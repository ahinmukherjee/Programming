n=input("enter string")
start=0
end=len(n)-1
is_palin=True
while(start< end):
    if(n[start]!=n[end]):
        is_palin=False
        break
    start+=1
    end-=1
if is_palin:
    print("palindrom")
else:
     print("palindrom not")
