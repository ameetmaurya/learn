#include<stdio.h>

void main()
{
    int n,reverse =0,remainder;
    printf("enter the integer:");
    scanf("%d",&n);

    while(n!=0)
    {
        remainder = n%10;
        reverse = reverse*10+remainder;
        n/=10;
    }
    printf("Reversed number = %d",reverse);
}