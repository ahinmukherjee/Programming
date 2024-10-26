a= int(input("enter year: "))
if(a%100==0):
    print("processing")
    if(a%4==0):
        print("calculate the year")
        if(a%400==0):
            print("year is leep year")
else:
    print("year is not leep year")