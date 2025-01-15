class A:
    def displayed(self):
        print("a")
class B:
    def displays(self):
        print("a+")
class C(A,B):
    def display(self):
        print("a--")
obj=C()
obj.displays()
obj.displayed()