#include <stdio.h>
void main()
{
    int arr[50];
    int n;
    printf("Enter the number of element");
    scanf("%d",&n);

   for(int i =0;i<n;i++)
   {
    scanf("%d",&arr[i]);
   }
    int largest, smallest;
    largest = arr[0];
    smallest = arr[0];

    for (int i = 1; i<n; i++)
    {
        if (arr[i] > largest)
        {
            largest = arr[i];
        }

        if (arr[i] < largest)
        {
            smallest = arr[i];
        }
    }

    printf("largest = %d \n smallest = %d",largest,smallest);
}