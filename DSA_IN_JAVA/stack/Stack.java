import java.util.*;
import java.util.Scanner;

class Stack {
    final int MAX = 100;
     int[] stack = new int[MAX];
    // int stack[];
    int top = -1;

    // Method to push an element to the stack
    public int push(int value) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return -1;
        }
        stack[++top] = value;
        return 0;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Method to print the stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(0);

        System.out.println("Stack contents:");
        myStack.printStack();

        int poppedValue = myStack.pop();
        if (poppedValue != -1) {
            System.out.println("Popped value: " + poppedValue);
        }

        System.out.println("Stack contents after pop:");
        myStack.printStack();
    }
}
