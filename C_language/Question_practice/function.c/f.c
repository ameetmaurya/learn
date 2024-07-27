#include<stdio.h>
#include<conio.h>
void circle(float r)
{
float diameter,circumference,area;
diameter=2*r;
printf("\n Diameter=%f",diameter);
circumference=2*3.14*r;
printf("\n Circumference=%f",circumference);
area=3.14*r*r;
printf("\n Area=%f",area);
}
void main()
{
float radius;

printf("\n Enter radius:");
scanf("%f",&radius);
circle(radius);

}