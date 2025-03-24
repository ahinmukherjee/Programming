class node:
    def __init__(self):
        self.data= int(input("Data is"))
        self.next=None

class Queue:
    def create(self):
        global front,rear
        temp=node()
        if(rear==None):
            front=temp
            rear=temp
        else:
            rear.next=temp
            rear=temp

    def delete(self):
        if(front==None):
            print("Queue is empty")
        else:
            temp=front
            print("Dleteed data is", temp.data)
            front=front.next
            del(temp)

    def display(self):
        temp=rear
        while(temp!=None):
            print(temp.data)
            temp=temp.next


front=rear=None
a=Queue()
while True:
    print("1: Create")
    print("2: Delete")
    print("3: Display")

    ch=int(input("your choice"))
    if ch==1:
        a.create()
    elif ch==2:
        a.delete()
    elif ch==3:
       a.display()
    elif ch==4:
        break