#include<stdio.h>

void main()
{
    int arr[]= {2,3,4,1};
    int sum =0;
    int *ptr;
      ptr = arr;
    for(int i =0;i<4;i++)
    {
      sum +=*ptr;
      ptr++;

    }
    printf("%d",sum);
}