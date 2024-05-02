#include<stdio.h>

struct Employee {
    int  Employee_id; 
    char employee_name[30]
};
void main()
{
 struct Employee e[5];

 printf("Enter the Details of employee \n");
 for(int i =0;i<5;i++)
 {
  printf("Enter the Employee_id and Employee_name \n");
  scanf("%d %s",&e[i].Employee_id,&e[i].employee_name);
 }

 printf("Employee details are:\n");
 for(int i =0;i<5;i++)
 {
  printf("Employee_id is %d \n and Employee_name is %s \n",e[i].Employee_id,e[i].employee_name);
 
 }
}