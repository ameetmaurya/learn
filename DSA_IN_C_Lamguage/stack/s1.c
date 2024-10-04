#include<stdio.h>
#include<stdlib.h>
int top =-1;
int arr[3];
void push();
void pop();
void show();

int main()
{
    int choice;
    while (1)
    {
      printf("perform operation on the stackL\n");
      printf("1.push operation\n2.pop operation.\n3.show.\n4.end");
    printf("\nenter the choice");
    scanf("%d",&choice);
    

     switch (choice)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            show();
            break;
        case 4:
            exit(0);

        default:
            printf("\nInvalid choice!!");
        }
    }

    
}
void push()
{
    int x;

    if (top == arr - 1)
    {
        printf("\nOverflow!!");
    }
    else
    {
        printf("\nEnter the element to be added onto the stack: ");
        scanf("%d", &x);
        top = top + 1;
        arr[top] = x;
    }
}
void pop()
{
    if (top == -1)
    {
        printf("\nUnderflow!!");
    }
    else
    {
        printf("\nPopped element: %d", arr[top]);
        top = top - 1;
    }
}

void show()
{
    if (top == -1)
    {
        printf("\nUnderflow!!");
    }
    else
    {
        printf("\nElements present in the stack: \n");
        for (int i = top; i >= 0; --i)
            printf("%d\n",arr[i]);
    }
}
