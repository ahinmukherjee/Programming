# shallow copy
import array
l1=array.array('i',[10,20,30,40])
l2=l1
l1[0]=65
print(l2)