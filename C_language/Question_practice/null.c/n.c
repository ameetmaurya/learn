#include<stdio.h>

void main()
{
    int len =0;
    char str[30];

    printf("enter the string");
    scanf("%s",&str);

    for(int i =0;str[i]!=NULL;i++)

    {
     len++;
    }

    printf("%d",len);
    
}