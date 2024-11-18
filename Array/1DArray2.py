# deep copy

import copy
import array
l1=array.array('i',[10,20,30,40])
l2=l1
print(l1)
l1[0]=65
l3=copy.copy(l1)
print(l3)
l3[2]=99
print(l1)
print(l3)