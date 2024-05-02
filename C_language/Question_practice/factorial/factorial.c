#include<stdio.h>

int fact(int n)
{ 
    if(n==0){
         return (1); 
    }
    else
    {
        return (n*fact(n-1));
    }

}

void main()
{
    int factorial, n;
    
    printf("enter the number \n");
    scanf("%d",&n);
   factorial = fact(n);
    printf("factorial number = %d \n",factorial);
}