#include<stdio.h>

void main()
{
    char ch;

    printf("enter the character:\n");
    scanf("%c",&ch);

switch(ch)
{
    case 'a':
    printf("%c is vowel",ch);
    break;
    case 'e':
    printf("%c is vowel",ch);
    break;
    case 'i':
    printf("%c is vowel",ch);
    break;
    case 'o':
    printf("%c is vowel",ch);
    break;
    case 'u':
    printf("%c is vowel",ch);
    break;
    default:
    printf("%c is a constant",ch);
}

}