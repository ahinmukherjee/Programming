class A:
    def __init__(self, a,b):
        self.a=a
        self.b= b 
    def variable(self):
        self.a, self.b = self.b, self.a
z=20
y=40
obj=A(z,y)
obj.variable()
z,y= obj.a, obj.b 
print(z,y)
