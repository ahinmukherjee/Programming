def loop(self):
    for i in range(self):
        for j in range(self-i):
           print()
        s=11**i
        while(s!=0):
                r=s%10
                print(r,'',end="")
                s=s//10
loop(4)