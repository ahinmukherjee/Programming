item=int(input("enter searching elements"))
arr=[2,4,5,67,9,-9]
for i in range(len(arr)):
    if(arr[i]==item):
        print("Searching elelments is found")
    else:
        print("Searching elelments is not found")