#include<stdio.h>
void main()
{
    int arr[5];
    int n;
    int sum =0;
    printf("Enter the number");
    scanf("%d",&n);

    for(int i =0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i =0;i<n;i++)

    {
       sum +=arr[i];
    }
    printf("%d",sum);
}