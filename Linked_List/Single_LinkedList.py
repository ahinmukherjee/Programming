class node:
    def __init__(self):
        self.data= int(input("Data is"))
        self.next=None

class Single_Linked:
    def create(self):
        global start, current
        temp=node()
        if(start==None):
            start=temp
            current=temp
        else:
            current.next=temp
            current=temp
            
    def display(self):
        print("value is")
        temp=start
        while(temp!=None):
            print(temp.data)
            temp=temp.next

start=current=None
a=Single_Linked()
n=int(input("enter total node number"))
for i in range(n):
    a.create()
a.display()