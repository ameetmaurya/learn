// #include <stdio.h>
// int main() {
//     int data[5];

//     printf("Enter elements: ");
//     for (int i = 0; i < 5; ++i)
//         scanf("%d", data + i);

//     printf("You entered: \n");
//     for (int i = 0; i < 5; ++i)
//         printf("%d\n", *(data + i));
//     return 0;
// }

#include <stdio.h>  
#include <string.h>  
int main()  
{  
    char str[40]; // declare the size of character string  
    printf (" \n Enter a string to be reversed: ");  
    scanf ("%s", str);  
      
    // use strrev() function to reverse a string  
    printf (" \n After the reverse of a string: %s ", strrev(str));  
    return 0;  
}  
