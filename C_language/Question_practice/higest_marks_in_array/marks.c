#include <stdio.h>

int main() {
    int n;
    printf("Enter the number of students: ");
    scanf("%d", &n);

    // Declare an array to store marks
    float marks[n];

    // Input marks for each student
    for (int i = 0; i < n; i++) {
        printf("Enter the mark for student %d: ", i + 1);
        scanf("%f", &marks[i]);
    }

    // Find the highest mark
    float highest_mark = marks[0];
    for (int i = 1; i < n; i++) {
        if (marks[i] > highest_mark) {
            highest_mark = marks[i];
        }
    }

    // Print the highest mark
    printf("The highest mark in the class is: %.2f\n", highest_mark);

    return 0;
}