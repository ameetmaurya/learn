#include<stdio.h>

struct date 
{
    int day;
    int month;
    int year;
};
void main()
{
   struct date d1;
   d1.day =25;
   d1.month = 12;
   d1.year = 2020;
   printf("%d %d %d",d1.day,d1.month,d1.year);
}