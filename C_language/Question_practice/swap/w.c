#include<stdio.h>
 void main()
 {
    int temp;
    int a = 10;
    int b =5;
    printf("THe number before swapping\n");
    printf("a =%d\n,b= %d\n",a,b);

   printf("the number after swapping");
 swap(&a,&b);
    printf("\na =%d,b= %d\n",a,b);
    
   
 }

 void swap(int *
 x,int *y)
 {
   int temp;
   temp = *x;
   *x =*y;
   *y = temp;
 }