#include<stdio.h>

void main()
{
    int num1 ,num2;

    printf("enter the number 1:");
    scanf("%d",&num1);
    
     
    printf("enter the number 2:");
    scanf("%d",&num2);

    if(num1>num2 )
    {
        printf("biggest number is  %d",num1);
    }
    else
    {
        printf("biggest number is %d",num2);
    }
   
}