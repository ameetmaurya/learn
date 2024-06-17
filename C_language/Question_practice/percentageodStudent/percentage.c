#include<stdio.h>

#include<conio.h>

void main() {

float marks[4];

float total=0.0, perc=0.0;

int i;



for(i=1;i<=4;i++) {

printf("Enter marks of subject %d",i);
scanf("%f",&marks[i]);

}

for(i=1;i<=4;i++){

total=total+marks[i];

}

printf("Total is :%f",total);

perc=total/4;

printf("Percentage is %f",perc);

}