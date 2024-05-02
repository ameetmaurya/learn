#include<stdio.h>
int a , b;

void add()
{
    printf("sum = %d \n",a+b);
}
void multi()
{
    printf("product = %d",a*b);
}

void main()
{
 printf("enter the first number\n:");
 scanf("%d",&a);
  printf("enter the second number\n:");
 scanf("%d",&b);
 add();
 multi();
}
