// hour, minute & second

#include<conio.h>
#include<stdio.h>
void main()
{
    int n,h,m,s,t;
    clrscr();
    printf("enter number\n");
    scanf("%d",&n);
    switch(n)
    {
        case 1:
        printf("enter h,m,s\n");
        scanf("%d%d%d",&h,&m,&s);
        t=((h*3600)+(m*60)+s);
        printf("Total is=%d",t);
        break;
        case 2:
        printf("enter total second\n");
        scanf("%d",&s);
        h=(s/3600);
        s=(s%3600);
        printf("hours=%d\t",h);
        m=(s/60);
        s=(s%60);
        printf("minutes=%d\t",m);
        printf("second=%d\t",s);
        break;
    }
    getch();
}
