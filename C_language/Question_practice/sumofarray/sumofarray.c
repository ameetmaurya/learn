#include<stdio.h>

void main()
{
   int a[5];
   int  sum=0;
   printf("enter the array element ");
   for(int i=0;i<5;i++)
   {
    scanf("%d",&a[i]);
   }
   for(int i =0;i<5;i++)
    {
        sum = sum + a[i];
    }
    printf("Sum = %d \n",sum);

}