#include<stdio.h>

void area(float radius)
{
    float area;
       area = 3.14*radius*radius;
         printf("area od circle = %f",area);
}

void main()
{
   float r;
    printf("enter the radius of circle:");
    scanf("%f",&r);
    area(r);
    

}

