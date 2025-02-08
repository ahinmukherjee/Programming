#include<stdio.h>
#include<conio.h>
void main()
{
char name[20];
clrscr();
printf("enter name\n");
scanf("%s",&name);
gets(name);
printf("%s\n",&name[2]);
getch();
}