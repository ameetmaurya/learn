#include<stdio.h>

struct employee 
{
 int employee_id;
 char name[30];
 int age;
 int salary;
};

void main()
{
struct employee e[3];

for(int i =0;i<3;i++)
{
    printf("enter employee_id:");
    scanf("%d",&e[i].employee_id);

    printf("enter name:");
    scanf("%s",&e[i].name);

    printf("enter age:");
    scanf("%d",&e[i].age);

    printf("enter salary:");
    scanf("%d",&e[i].salary);
}

for(int i =0;i<3;i++)
{
    printf(" Emplyee_id=%d \n",e[i].employee_id);
     printf(" name=%s \n",e[i].name);
      printf(" age=%d \n",e[i].age);
       printf(" salary=%d \n",e[i].salary);
}
}