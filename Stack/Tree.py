class node:
    def __init__(self):
        self.left=None
        self.data= int(input("Data is:"))
        self.right=None

def create(root, temp):
    if(temp.data < root.data):
        if(root.left==None):
            root.left=temp
        else:
            create(root.left, temp)

    elif(temp.data> root.data):
        if(root.right==None):
            root.right=temp
        else:
            create(root.right, temp)

def inorder(root):
    if(root!=None):
        inorder(root.left)
        print(root.data)
        inorder(root.right)

def preorder(root):
    if(root!=None):
        print(root.data)
        preorder(root.left)
        preorder(root.right)

def postorder(root):
    if(root!=None):
        postorder(root.left)
        postorder(root.right)
        print(root.data)

root= None
while True:
    ch=input("1 for Create || 2 for Inorder || 3 for Preorder || 4 for postorder|| q for Quit:")
    if ch=='1':
        temp=node()
        if root==None:
            root=temp
        else:
            create(root,temp)
    elif ch=='2':
        inorder(root)
    elif ch=='3':
        preorder(root)
    elif ch=='4':
        postorder(root)
    elif ch=="q":
        break
    else:
        print("valid input")
