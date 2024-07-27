#include<stdio.h>

void main()
{
  int x ,y;

  printf("ENTER the value of x:\n");
  scanf("%d",&x);
    printf("ENTER the value of y:\n");
  scanf("%d",&y);
   swap(&x,&y);
  printf("x =%d \n",x);
  printf("y=%d\n",y);

  int sum = x+y;
  printf("sum of x+y=%d",sum);
}

void swap(int *a,int *b)
{
    int temp;
    temp = *a;
    *a = *b;
     *b = temp;
}