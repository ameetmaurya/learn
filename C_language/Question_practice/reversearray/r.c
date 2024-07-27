#include<stdio.h>

void main()
{
    int arr[10];
    int n;
    printf("ENTER the number:\n");
    scanf("%d",&n);
 
    printf("enter the number of element:\n");
    for(int i =0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }

    for(int i =n-1;i>=0;i--)
    {
        printf("%d \t",arr[i]);
    }



}