class node:
    def __init__(self):
        self.data= int(input("enter value"))
        self.next=None

class Pra:
    def create(self):
        global start,current
        temp=node()
        if(start==None):
            start=temp
            current=temp
        else:
            current.next=temp
            current=temp
    def insert(self):
        global start,current
        temp=node()
        temp.next=start
        start=temp

    # def delete(self):
    #     global start,current
    #     prev=current=start
    #     if(current.next!=None):
    #         current.prev=None
    
    #     current=current.next
    #     print(current)
    #     del(current)


    def display(self):
        print("value is")
        temp=start
        while(temp!=None):
            print(temp.data)
            temp=temp.next

start=current=None
a=Pra()
n=int(input("enter number what you wnat"))
for i in range(n):
    a.create()
a.display()

a.delete()
a.display()