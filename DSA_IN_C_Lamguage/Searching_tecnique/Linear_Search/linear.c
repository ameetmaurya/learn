#include <stdio.h>

#define MAX 5
int main() {
    int stack[MAX];
    int top = -1; 


    if (top < MAX - 1) {
        stack[++top] = 10;  // Push 10
        printf("%d",++top);
        
    }
     pop();
     if (top == -1) {
        printf("Stack is empty\n");
    } else {
        printf("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            printf("%d ", stack[i]);
        }
        printf("\n");

       
    }

    return 0;
}