#include<stdio.h>

void main()
{
    int arr[40];
    int n;
    int store;
    printf("Enter the element");
    scanf("%d",&n);

    printf("Enter the number\n");

    for(int i =0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }

  for(int i =0;i<n;i++)
  {
    for(int j =i+1;j<n;j++)
    {
        if(arr[i]>arr[j])
        {
            store = arr[i];
            arr[i]=arr[j];
            arr[j]= store;
        }
        

    }

  }
  for(int i =0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
}