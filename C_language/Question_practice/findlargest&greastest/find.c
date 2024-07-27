#include<stdio.h>

void main()
{
    int arr[10]= {1,2,3,4,5,6,7,8,9,10};
    int largest,smallest;
    largest = smallest = arr[0];

    for(int i =1;i<10;i++)
    {
        if(arr[i]>largest)
        {
            largest = arr[i];
        }
  
        if(arr[i]<smallest)
        {
            smallest = arr[i];
        }
    }
    printf("largest =%d",largest);
    printf("smallest =%d",smallest);

}