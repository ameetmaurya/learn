#include<stdio.h>

void main()
{
    char str1[20];
    char str2[40];

    printf("Enter the first string");
    scanf("%s",&str1);

    printf("Enter the second String ");
    scanf("%s",&str2);

    if(strcmp(str1,str2)==0)
    {
        printf("both the string are equal\n");
    }
    else{
        printf("string are not equal");
    }
}

