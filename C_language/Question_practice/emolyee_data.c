#include<stdio.h>

struct employee
{
    char name[20];
    char disnation[10];
    int age;
    float salary;


};

void main()
{
    struct employee e[3];

    for(int i =0;i<3;i++)
    {
        printf("enter the name:\n");
        scanf("%s",&e[i].name);
          printf("enter the degination:\n");
        scanf("%s",&e[i].disnation);
          printf("enter the age:\n");
        scanf("%d",&e[i].age);
          printf("enter the salary:\n");
        scanf("%f",&e[i].salary);

        
    }

    for(int i=0;i<3;i++)
    {
        printf("name =%s \n",e[i].name);
        printf("degination = %s \n",e[i].disnation);
        printf("age=%d \n",e[i].age);
        printf("salary = %f \n",e[i].salary);
    }
}