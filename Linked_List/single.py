class Node:
    def __init__(self, data):
        self.data= data
        self.next= None

class LinkedList(Node):
    def __init__(self):
        self.head= None
    
    def InsertBegin(self, data):
        new = Node(data)
        new.next= self.head
        self.head= new

    def Print(self):
        current= self.head
        if not current:
            print("The list is empty")
            return
        while current:
            print(current.data,'',end='')
            current=current.next

obj=LinkedList()
obj.InsertBegin(30)
obj.InsertBegin(20)
obj.InsertBegin(10)
obj.Print()