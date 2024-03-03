#include<stdio.h>

void main()
{
   int  temp = 0;
    int arr[4]= {3,5,2,1};
    printf("Before Swaping \n");
    for(int i =0;i<4;i++)
    {
      printf("%d \n",arr[i]);
    }
     
    for(int i = 0;i<4;i++)
    {
        for(int j=0;j<4;j++)

        if(arr[j]>arr[j+1])
        {
          temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
    }
    printf("\n");
    printf("After Swafing \n");

    for(int i =0;i<4;i++)
    {
        printf("%d \n",arr[i]);
    }
   
}