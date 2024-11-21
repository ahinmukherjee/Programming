#find common number in two list 
l1=(10, 20, 30, 40)
l2=(-20, 11, 40, 33)

for i in range(len(l1)):
    for j in range(len(l2)):
        if(l1[i]==l2[j]):
            print(l1[i],l2[j])
            print("yes")
        
 