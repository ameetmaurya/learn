#include<stdio.h>

void main()
{
    int arr[]={1,2,3,4};
    int *ptr =arr;

 for(int i =0;i<4;i++)
 {
    printf("arr[%d] = %d \n",i,*(arr+i));
 }
}