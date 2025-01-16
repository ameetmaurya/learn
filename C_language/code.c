#include<stdio.h>
#include<malloc.h>

void create_list(int);
void addatbeg(int);
void addatend(int);
void display();
struct node
{
int info;
struct node *next;
}*start=NULL;
void main()
{
int m;

printf("enter data value\n");
scanf("%d",&m);
create_list(m);
printf("enter data value at beg\n");
scanf("%d",&m);
addatbeg(m);
printf("enter the data value at end\n");
scanf("%d",&m);
addatend(m);
display();

}
void create_list(int data)
{
struct node *tmp;
tmp=malloc(sizeof(struct node));
tmp->info=data;
tmp->next=NULL;
start=tmp;
}
void addatbeg(int data)
{
struct node *tmp;
tmp=malloc(sizeof(struct node));
tmp->info=data;
tmp->next=start;
start=tmp;
}

void addatend(int data)
{
struct node *tmp,*q;
tmp=malloc(sizeof(struct node));
tmp->info=data;
tmp->next=NULL;
q=start;
while(q->next!=NULL)
{
q=q->next;

}
q->next=tmp;
}
void display()
{
struct node *q;
if(start==NULL)
{
printf("list is empty\n");
}
q=start;
printf("ist is:\n");
while(q!=NULL)
{
printf("%d\t",q->info);
q=q->next;
}
}
