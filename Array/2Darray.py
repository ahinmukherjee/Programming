import copy
import array
# l1=array.array('i',[1,[10,20],[30,40]])
l1=[1,[10,20],[30,40]]
l2=copy.copy(l1)
print(l1)
l1[0][1]=65
print(l2)
l3=copy.deepcopy(l1)
l3[2][0]=99
print(l3)
# l3[2]=99
# print(l1)
# print(l3)