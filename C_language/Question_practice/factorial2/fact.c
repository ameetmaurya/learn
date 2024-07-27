int fact(int x);

int main()
{
    int n;
    printf("Enter the number");
    scanf("%d",&n);
  
   printf("%d",fact(n));
}

int fact(int num)
{
    if(num ==0||num==1)
    {
        return 1;
    }
    else{
        return num*fact(num-1);
    }
}