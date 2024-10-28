price = int(input("enter price: "))
r=0
price1=0
if(price==1500 or price>1500):
    r = (price*(20/100))
    price1= price-r
    print(price)
    print(price1)
elif(price==1000 or price>1000):
    r = (price*(15/100))
    price1 = price-r
    print(price)
    print(price1)
elif(price==500 or price>500):
    r = (price*(5/100))
    price1 = price-r
    print(price)
    print(price1)
else:
    print("Not avalabile for dicount offer")