#include<stdio.h>

void main()
{
    int a ,b,c;

    printf("Enter the Three Number:\n");
   scanf("%d %d %d",&a , &b,&c);

    if(a>b && a>c)
    {
        printf("A is grater");
    }
    else if (b>a && b>c)
    {
       printf("B is greater");
    }
    else
    {
        printf("C is greater");
    }

}