#include<stdio.h>
void main()
{
    int n1,n2,result;
     int *ptr1,*ptr2;
    printf("Enter the number 1:");
    scanf("%d",&n1);

    printf("enter the number 2:");
    scanf("%d",&n2);
  
  ptr1 =&n1;
  ptr2=&n2;

  result = (*ptr1)+(*ptr2);
  printf("%d \n",result);

  result = (*ptr1)-(*ptr2);
  printf("%d\n",result);


  result = (*ptr1)*(*ptr2);
  printf("%d\n",result);


  result = (*ptr1)/(*ptr2);
  printf("%d \n",result);





}