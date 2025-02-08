#include<stdio.h>
#include<conio.h>
void main(){
    int a,b,n,sum,diff,multi,divi;
    clrscr();
    //printf("enter two number");
    //scanf("%d%d",&a,&b);
    printf("enter your choice");
    scanf("%d",&n);
    switch(n){
    case 1:
    printf("enter two number\n");
    sum=a+b;
    printf("sum=%d ",sum);
    scanf("%d%d",&a,&b);
    break;
    case 2:
    scanf("%d%d",&a,&b);
    diff=a-b;
    printf("enter two number\n");
    printf("diff=%d ",diff);
    break;  
    case 3:
    printf("enter two number\n");
    scanf("%d%d",&a,&b);
    multi=a*b;
    printf("multi=%d ",multi);
    break;
    case 4:
    printf("ente    r two number\n");
    scanf("%d%d",&a,&b);
    divi=a/b;
    printf("divi=%d ",divi);
    break;
    default:    
    printf("hello");
    }
    getch();
}