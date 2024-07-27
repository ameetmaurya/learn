#include<stdio.h>

int fact(int);

void main()
{
    int n,x;
printf("Enter the number to find factorial: ");
scanf("%d",&x);

n = fact(x);
printf("Factorial od %d id %d",n,x);
}
int fact(x)
{
    if(x==0)
    return 1;
    else
    return(x*fact(x-1));
}