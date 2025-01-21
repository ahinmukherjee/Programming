def palindrom(self,other):
    # other=0
    while(self>0):
        r = self%10
        other = (other*10)+r
        self= self//10
    if(self==other):
        print("palindrom")
    else:
        print("palindrom not")
n=int(input("enter range"))
s=0
palindrom(n,s)    
