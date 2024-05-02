#include<stdio.h>
#include<string.h>

void main()
{
    char s1[20],s2[30];
    int a ,b;

    printf("Enter the first string:");
    scanf("%s",&s1);

    printf("Enter the second string:");
    scanf("%s",&s2);

    a = strlen(s1);
    b = strlen(s2);
    printf("Length of String1:%d \n Length of string2:  %d  ",a,b);

    strcat(s1,s2);
    printf("Concatinatin string is %s",s1);
}
