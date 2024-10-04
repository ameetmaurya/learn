#include <stdio.h>
#include<stdlib.h>
#define MAX 100
int stack[MAX];
int top = -1;
int push(int value) {
    if (top >= MAX - 1) {
        
        return -1;
    }
    stack[++top] = value;
    return 0; 
}
int pop() {
    if (top == -1) {
        return -1; 
    return stack[top--];
}
int poppedValue = stack[top]; 
    top--; 
    return poppedValue; 
}


void printStack() {
    if (top == -1) {
        printf("Stack is empty.\n");
        return;
    }
    for (int i = 0; i <= top; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}
int main() {
    push(10);
    push(20);
    push(0);
  

    printf("Stack contents:\n");
    printStack(); 

int  poppedValue = pop();
    if (poppedValue != -1) {
        printf("Popped value: %d\n", poppedValue);
    }

          
    printf("Stack contents after pop:\n");
    printStack();
   
 
    return 0;
}

