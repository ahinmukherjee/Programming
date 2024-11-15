#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,a[20];
clrscr();
printf("enter how many number you want\n");
scanf("%d",&n);
printf("enter array elemnt one by one\n");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
printf("after creating the array is:\n");
for(i=0;i<n;i++)
printf("a[%d]=%d\n",i,a[i]);
getch();
}