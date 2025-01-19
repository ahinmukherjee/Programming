n=int(input("enter number"))
prime_is= True
for i in range(2, int(n ** 0.5)+1):
    if(n%i==0): 
       prime_is= False
       break
if prime_is and n>1:
    print(n,"number is prime")
else:
    print(n,"is not prime")