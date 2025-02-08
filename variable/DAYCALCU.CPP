#include<iostream.h>
#include<conio.h>
void main()
{
int y,m,d,total=0;
clrscr();
cout<<" enter the y,m,d"<<endl;
cin>>y>>m>>d;
total=(365*y)+(30*m)+d;
cout<<"total day ="<<total<<endl;
getch();
}
