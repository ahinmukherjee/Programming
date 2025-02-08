#include<stdio.h>
#include<conio.h>
num=int(input("enter number"));
sum1=0
r=0
while(num>0){
    r=num%10
    sum1=sum1+r
    num=num//10
    print("Addition of digit for every step", sum1)
}
print(sum1);
