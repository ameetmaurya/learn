#include<stdio.h>

int fibonachi(int n);

void main()
{
    int num;
    printf("enter the number of turns:");
    scanf("%d",&num);

    for(int i =0;i<num;i++)
    {
        printf("%d ",fibonachi(i));
    }
}
int fibonachi(int n)
{
    if (n==0)
    {
        return 0;
    }
    else if(n==1){
        return 1;
    }
    else{
        return fibonachi(n-1)+fibonachi(n-2);
    }
    
}