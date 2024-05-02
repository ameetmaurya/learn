#include <stdio.h>
void main()
{
int a[10],i,largest;
int smallest;

printf("Enter array elements\n");
for(i=0;i<10;i++)
{
scanf("%d",&a[i]);
}
largest=a[0];
smallest = a[0];

for(i=1;i<10;i++)
{
if (a[i]>largest)
{
largest=a[i];
}
if (a[i]<smallest)
{
smallest=a[i];
}

}
printf("The largest element in the array is : %d",largest);
printf("The smallestelement in the array is : %d",smallest);
}