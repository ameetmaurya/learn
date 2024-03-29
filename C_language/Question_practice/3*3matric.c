#include<stdio.h>

void main()
{
    
    
    int a[3][3]={{1,1,1},{1,1,1},{1,1,1}};
    int b[3][3]={{1,1,1},{1,1,1},{1,1,1}};
   int c[3][3];

   for( int i =0;i<3;i++)
   {
        for(int j =0;j<3;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }
   }

   printf("Result of 3*3 matrix addition \n");

     for( int i =0;i<3;i++)
   {
        for(int j =0;j<3;j++)
        {
            printf("%d \t",c[i][j]);
        }
        printf("\n");
   }
}